import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        //an object of scanner named "in" is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //the user is asked for a starting string
        System.out.print("Enter a starting string: ");
        //takes in the users input into startingString
        String startingString = in.nextLine();
        //A variable named menuOption is made and set to -1
        int menuOption = -1;
        //this while loop keeps asking the user to pick from the menu and will run
        // as long as they don't input 7, which will end the loop and program
        while (menuOption != 7) {
            //an object of scanner named "secondIn" is made, it will allow input from the normal input
            //of the system like the keyboard using the System.in
            Scanner secondIn = new Scanner(System.in);
            //the user is asked to pick from a menu of options
            System.out.println(" ");
            System.out.print("Pick an option:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit\n " +
                    " \n");
            //takes in the users input into menuOption
            menuOption = secondIn.nextInt();
            //if user inputs 1 then they will have to input the content they want to add
            //and then the method addContent is called which will add the users input
            //to the current string and this will if statement will also print out the new string
            if (menuOption == 1) {
                //an object of scanner named "thirdIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner thirdIn = new Scanner(System.in);
                //user is asked for content they want to add
                System.out.println("Input content you want to add: ");
                //takes in the users input into appendToCurrentString
                String appendToCurrentString = thirdIn.next();
                //calls the addContent method and passes in staringString
                //and the users input from appendToCurrentString
                //then prints out the new string with the change made from
                //calling the method
                System.out.println("Current string: " + addContent(startingString, appendToCurrentString));
                //staringString becomes itself plus the addition of the string the user inputted
                //so that the other methods can use this new startingString
                startingString = addContent(startingString, appendToCurrentString);
            }
            //if user inputs 2 then if statement will check if the string contains what the user inputs
            //for thisIsTheSubstringToCheckFor
            if (menuOption == 2) {
                //an object of scanner named "fourthIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner fourthIn = new Scanner(System.in);
                //asks user what they want to check the string contains
                System.out.println("Input what you want to check the string contains: ");
                //takes in the users input into thisIsTheSubstringToCheckFor
                String thisIsTheSubstringToCheckFor = fourthIn.next();
                //calls the checkIfStringContainsSubstring method and passes in staringString
                //and the users input from thisIsTheSubstringToCheckFor
                //then prints out true or false if the string contains the user input
                System.out.println(checkIfStringContainsSubstring(startingString, thisIsTheSubstringToCheckFor));
            }
            //if user inputs 3 then this if statement prints the length of the string
            if (menuOption == 3) {
                //calls outputLength method and prints the length of startingString
                System.out.println("Length is: " + outputLength(startingString));
            }
            //if user inputs 4 then this if statement will print substring after prefix they enter for printAfterThisSubstring
            if (menuOption == 4) {
                //an object of scanner named "fifthIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner fifthIn = new Scanner(System.in);
                //user is asked for prefix
                System.out.println("Prefix: ");
                //takes in the users input into printAfterThisSubstring
                String printAfterThisSubstring = fifthIn.next();
                //calls outputSubstringAfterPrefix and passes in startingString and printAfterThisSubstring
                //and prints the substring after the prefix they entered
                System.out.println("Substring: " + outputSubstringAfterPrefix(startingString, printAfterThisSubstring));
            }
            //if user inputs 5 then they will input a suffix and the substring before that suffix will print
            if (menuOption == 5) {
                //an object of scanner named "sixthIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner sixthIn = new Scanner(System.in);
                //user is asked for suffix
                System.out.println("Suffix: ");
                //takes in the users input into printBeforeThisSubstring
                String printBeforeThisSubstring = sixthIn.next();
                //the method outputSubstringBeforeSuffix is called and startingString and printBeforeThisSubstring
                //are passed in and then the substring before the suffix they entered will print
                System.out.println("Substring: " + outputSubstringBeforeSuffix(startingString, printBeforeThisSubstring));
            }
            //if user inputs 6 then they will input a prefix and suffix and the substring in-between them will print
            if (menuOption == 6) {
                //an object of scanner named "seventhIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner seventhIn = new Scanner(System.in);
                //user is asked for prefix
                System.out.println("Prefix: ");
                //takes in the users input into printBetweenThisPrefix
                String printBetweenThisPrefix = seventhIn.next();
                //an object of scanner named "eighthIn" is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner eighthIn = new Scanner(System.in);
                //user is asked for suffix
                System.out.println("Suffix: ");
                //takes in the users input into printBetweenThisSuffix
                String printBetweenThisSuffix = eighthIn.next();
                //calls outputSubstringBetweenPrefixAndSuffix method and passes in startingString and printBetweenThisPrefix
                //printBetweenThisSuffix and then the substring between the prefix and suffix they entered will print
                System.out.println("Substring: " + outputSubstringBetweenPrefixAndSuffix(startingString, printBetweenThisPrefix, printBetweenThisSuffix));
            }
        }
    }

    //this method adds user input to startingString
    public static String addContent(String startingString, String appendToCurrentString) {
        //adds user input from appendToCurrentString to startingString
        startingString = startingString.concat(appendToCurrentString);
        return startingString;
    }

    //this method returns true or false if the content the user inputted was in the string
    public static boolean checkIfStringContainsSubstring(String startingString, String thisIsTheSubstringToCheckFor) {
        //returns true if startingString has input from thisIsTheSubstringToCheckFor
        if (startingString.indexOf(thisIsTheSubstringToCheckFor) != -1) {
            return true;
        }
        return false;
    }

    //this method returns length of startingString
    public static int outputLength(String startingString) {
        //the length of starting String is set to an integer variable called length
        int length = startingString.length();
        return length;
    }

    //this method returns the substring after a prefix
    public static String outputSubstringAfterPrefix(String startingString, String printAfterThisSubstring) {
        //returns substring from printAfterThisSubstring to end of startingString
        return startingString.substring((startingString.indexOf(printAfterThisSubstring) + printAfterThisSubstring.length()), startingString.length());
    }

    //this method returns the substring before a suffix
    public static String outputSubstringBeforeSuffix(String startingString, String printBeforeThisSubstring) {
        //return of starting from beginning of startingString and going to index of user input for printBeforeThisSubstring
        return startingString.substring(0, startingString.indexOf(printBeforeThisSubstring));
    }

    //this method returns the substring between a prefix and suffix
    public static String outputSubstringBetweenPrefixAndSuffix(String startingString, String printBetweenThisPrefix, String printBetweenThisSuffix) {
        //return of startingString by starting from the index of a prefix that user inputted for printBetweenThisPrefix
        //plus the length of that to the index of a suffix user inputted for printBetweenThisSuffix
        return startingString.substring((startingString.indexOf(printBetweenThisPrefix) + printBetweenThisPrefix.length()), startingString.indexOf(printBetweenThisSuffix));
    }
}