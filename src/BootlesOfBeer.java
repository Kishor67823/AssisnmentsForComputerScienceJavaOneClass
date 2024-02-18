import java.util.Scanner;

public class BootlesOfBeer {
    public static void main(String[] args) {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //asks the user to input a number of bottles
        System.out.print("Enter the number of bottles to start with: ");
        //takes in the users input into a variable called inputOfBottles
        int inputOfBottles = in.nextInt();
        //sets count to 0
        int count = 0;
        //sets a variable called bottles to the number stored in inputOfBottles
        int bottles = inputOfBottles;
        //while count is not greater than inputOfBottles keep running
        while (count <= inputOfBottles) {
            //prints the number of bottles on the wall
            if (bottles != 1) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");

            }
            //adds 1 to count
            count = count + 1;
            //this subtracts 1 from bottles
            bottles = bottles - 1;


            //prints if you go to the store or if you take one down and pass it around depending on what bottles equals
            if (bottles == -1) {
                System.out.println("Go to the store and buy some more, " + inputOfBottles + " bottles of beer on the wall.");
            } else if (bottles == 1) {
                System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
                System.out.println(" ");
            } else {
                System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");
                System.out.println(" ");
            }


        }
    }
}
