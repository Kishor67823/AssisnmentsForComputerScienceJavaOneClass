import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        //creates a int variable called continueIfNotNegativeOne
        //which will serve the purpose of stopping a while loop
        //if the user inputs -1
        int continueIfNotNegativeOne = 0;
        //creates an integer array called newArrayToStoreUsersValues
        //which stores 100 values since the user will never
        //enter more than a 100 values
        int[] newArrayToStoreUsersValues = new int[100];
        //creates an integer variable called count
        //which will serve the function of keeping track
        //of how many times a user inputted a variable
        //so that when the revered array is printed
        //it starts printing from the index of count
        //minus 1 to the index of 0 which is reverse
        int count = 0;
        //prints for the user to input values
        //or -1 to stop
        System.out.println("Enter values (-1 to stop)");
        //a while loop that keeps looping unless continueIfNotNegativeOne equals -1
        while (continueIfNotNegativeOne != -1) {
            //count is added by 1
            count++;
            //an object of scanner named "in " is made, it will allow input from the normal input
            //of the system like the keyboard using the System.in
            Scanner in = new Scanner(System.in);
            //just prints ":" out so the program looks organized when run
            System.out.print(": ");
            //takes in the users input into an integer variable called valuesInputtedByUser
            int valuesInputtedByUser = in.nextInt();
            //sets continueIfNotNegativeOne to valuesInputtedByUser
            continueIfNotNegativeOne = valuesInputtedByUser;
            //if valuesInputtedByUser is not -1 then add it to the array called newArrayToStoreUsersValues
            if (valuesInputtedByUser != -1) {
                //valuesInputtedByUser is set to the index of the value of count in newArrayToStoreUsersValues
                newArrayToStoreUsersValues[count] = valuesInputtedByUser;
            }
        }
        //prints out that these are your values revered
        System.out.println("Your values, reversed:");
        //creates a for loop which has i set to the value of what count is -1
        //and then the loop keeps looping while i is greater than 0 and each time
        //the loop runs i is subtracted by 1 , this allows this loop to run only the
        //number of times that the user inputted values besides the value -1, so if the user inputted
        //values in 5 times (not including the time they inputted -1) then this loop runs 5 times
        for (int i = count - 1; i > 0; i = i - 1) {
            //prints out the value in the array called newArrayToStoreUsersValues at index of i
            System.out.println(newArrayToStoreUsersValues[i]);
        }
    }
}
