public class RecursionPractice {
    public static void main(String[] args) {

        //stringForAppendNTimes recursively
        String stringForAppendNTimes = "dog";
        int integerForAppendNTimes = 4;
        System.out.println("recursive solution for appendNTimes: " + appendNTimes(stringForAppendNTimes, integerForAppendNTimes));

        //stringForAppendNTimes iteratively
        String stringForAppendNTimesIteratively = "dog";
        int integerForAppendNTimesIteratively = 4;
        System.out.println("iterative soltution for appendNTimes: " + appendNTimesIteratively(stringForAppendNTimesIteratively, integerForAppendNTimesIteratively));

        //contains recursively
        int[] arrayForContains = {1, 2, 3, 4, 5, 6, 7, 8};
        int secondNumber = 4;
        System.out.println("recursive solution for contains: " + contains(arrayForContains, secondNumber));

        //contains iteratively
        int[] arrayForContainsIteratively = {1, 2, 3, 4, 5, 6, 7, 8};
        int secondNumberIteratively = 4;
        System.out.println("iterative solution for contains: " + containsIteratively(arrayForContainsIteratively, secondNumberIteratively));
    }

    //stringForAppendNTimes done recursively
    public static String appendNTimes(String stringForAppendNTimes, int integerForAppendNTimes) {
        return appendNTimesInner(stringForAppendNTimes, integerForAppendNTimes);
    }

    public static String appendNTimesInner(String stringForAppendNTimes, int integerForAppendNTimes) {
        if (integerForAppendNTimes == 0) {
            return stringForAppendNTimes;
        }
        return stringForAppendNTimes + appendNTimesInner(stringForAppendNTimes, integerForAppendNTimes - 1);
    }

    //stringForAppendNTimes done iteratively
    public static String appendNTimesIteratively(String stringForAppendNTimesIteratively, int integerForAppendNTimesIteratively) {
        String finalStringForAppendNTimesIteratively = "";
        while (integerForAppendNTimesIteratively >= 0) {
            finalStringForAppendNTimesIteratively = finalStringForAppendNTimesIteratively + stringForAppendNTimesIteratively;
            integerForAppendNTimesIteratively--;
        }
        return finalStringForAppendNTimesIteratively;
    }

    //contains done recursively
    public static int contains(int[] arrayForContains, int secondNumber) {
        return containsInner(arrayForContains, secondNumber, 0);
    }

    public static int containsInner(int[] arrayForContains, int secondNumber, int index) {
        if (index == arrayForContains.length) {
            return -1;
        }
        if (arrayForContains[index] == secondNumber) {
            return index;
        }
        return containsInner(arrayForContains, secondNumber, index + 1);
    }

    //contains done iteratively
    public static int containsIteratively(int[] arrayForContainsIteratively, int secondNumberIteratively) {
        int index = 0;
        while (index != arrayForContainsIteratively.length) {
            if (arrayForContainsIteratively[index] == secondNumberIteratively) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
