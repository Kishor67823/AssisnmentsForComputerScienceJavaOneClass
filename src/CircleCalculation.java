import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //asks the user to input a radius
        System.out.print("Please enter a radius: ");
        //takes in the users input into a variable called inputOfRadius
        double inputOfRadius = in.nextDouble();
        //calls the calculateDiameter function and prints the results too
        System.out.println("The Diameter is: " + calculateDiameter(inputOfRadius));
        //calls the calculateArea function and prints the results too
        System.out.println("The Area is: " + calculateArea(inputOfRadius));
        //calls the calculateCircumference function and prints the results too
        System.out.println("The Circumference is: " + calculateCircumference(inputOfRadius));
    }

    //takes in inputOfRadius variable and returns diameter
    public static double calculateDiameter(double inputOfRadius) {
        return 2 * inputOfRadius;
    }

    //takes in inputOfRadius variable and returns area
    public static double calculateArea(double inputOfRadius) {
        return Math.PI * (inputOfRadius * inputOfRadius);
    }

    //takes in inputOfRadius variable and returns circumference
    public static double calculateCircumference(double inputOfRadius) {
        return 2 * Math.PI * inputOfRadius;
    }
}
