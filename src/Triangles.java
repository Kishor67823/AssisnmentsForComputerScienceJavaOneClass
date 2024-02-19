import java.util.Objects;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        //the variable of yesOrNo is assigned the string Y
        String yesOrNo = "Y";
        //the variable count is assigned the integer 1, and it will keep track of how many times
        //the next while loop is run
        int count = 1;
        //if yesOrNo equals capital or lowercase y then this while keeps running
        while (Objects.equals(yesOrNo, "Y") || Objects.equals(yesOrNo, "y")) {
            //if count is greater than 1 than input from the user for if they would like to make
            //another triangle is taken in , but if count is 1 then what's inside the if function
            //doesn't run since it doesn't make sense to ask if the user wants to make another triangle
            //when they are making a triangle for the first time
            if (count > 1) {
                //an object of scanner named "originalIn " is made, it will allow input from the normal input
                //of the system like the keyboard using the System.in
                Scanner originalIn = new Scanner(System.in);
                //the user is asked if they want to make another triangle
                System.out.print("Would you like another triangle (Y/N)?: ");
                //takes in the users input into a variable called yesOrNo
                yesOrNo = originalIn.next();
            }
            //count increases by 1 to keep track of how many times the while loop ran
            count = count + 1;
            //if the user wanted to continue to make another triangle then
            //the function that makes the triangle is called
            if (Objects.equals(yesOrNo, "Y") || Objects.equals(yesOrNo, "y")) {
                //the function that makes the triangle is called
                printTriangle();
            }
        }
    }

    public static void printTriangle() {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //asks the user to input a size
        System.out.print("Enter size: ");
        //takes in the users input into a variable called Size
        int Size = in.nextInt();
        //this while keeps asking the user to input a value between 1 and 50 if they don't enter one in that range
        while (Size < 1 || Size > 50) {
            //tells the user to input a value between 1 and 50
            System.out.println("Size must be between 1-50!");
            //an object of scanner named "in " is updated based on users input
            in = new Scanner(System.in);
            //asks the user to input a size
            System.out.print("Enter size: ");
            //takes in the users input into a variable called Size
            Size = in.nextInt();
        }
        //an object of scanner named "secondIn " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner secondIn = new Scanner(System.in);
        //asks the user to input a fill
        System.out.print("Enter fill: ");
        //takes in the users input into a variable called fill
        char fill = secondIn.next().charAt(0);
        //a nested for loop is made to make the triangle, the first for loop makes sure that
        //the correct number of lines is printed by starting i at 1 and increasing it by 1
        //each time the first for loop runs, and then stopping the for loop when i above the
        //size variable , so if you input 2 for size then this makes sure the triangle is 2 lines vertically
        for (int i = 1; i <= Size; i = i + 1) {
            //this nested for loop makes sure that before the fill is printed that the correct number of
            //spaces starts out each line of the triangle, by starting s at 0 and then adding it by 1 for each
            //time the for loop runs ensures the correct amount of spaces in each line
            // and because each lower line has 1 less space than the previous line is why
            //size is subtracted by 1
            for (int s = 0; s <= Size - i; s = s + 1) {
                //prints a space
                System.out.print(" ");
            }
            //this nested for loop makes sure that the correct amount of fill is printed by starting
            // f at 0 and then adding it by 1 for each
            //time the for loop runs ensures the correct amount of fill in each line
            // and because each lower line has 1 more fill than the previous line is why
            //the f is set to stop once it is greater than i which ensures that each line there is more and
            //more fill
            for (int f = 1; f <= i; f = f + 1) {
                //the fill plus a space is printed
                System.out.print(fill + " ");
            }
            //a line of empty is printed so the run program looks nice
            System.out.println(" ");
        }
    }
}
