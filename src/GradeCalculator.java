import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //This asks the user to input their grade
        System.out.print("Please enter your grade: ");
        //takes in the users name input into a variable called inputOfGrade
        double inputOfGrade = in.nextDouble();
        //This creates a string that has nothing in it so that later a letter grade can be assigned to it
        String Grade = "";
        //this will use if conditionals to determine the letter grade to a variable called Grade
        if (inputOfGrade >= 92) {
            //assigns the letter A to grade variable
            Grade = "A";
        }
        //this will use if conditionals to determine the letter grade to a variable called Grade
        else if (inputOfGrade >= 89) {
            //assigns the letter A to grade variable
            Grade = "A-";
        } else if (inputOfGrade >= 87) {
            //assigns the letter A to grade variable
            Grade = "B+";
        } else if (inputOfGrade >= 82) {
            //assigns the letter A to grade variable
            Grade = "B";
        } else if (inputOfGrade >= 79) {
            //assigns the letter A to grade variable
            Grade = "B-";
        } else if (inputOfGrade >= 77) {
            //assigns the letter A to grade variable
            Grade = "C+";
        } else if (inputOfGrade >= 72) {
            //assigns the letter A to grade variable
            Grade = "C";
        } else if (inputOfGrade >= 69) {
            //assigns the letter A to grade variable
            Grade = "C-";
        } else if (inputOfGrade >= 67) {
            //assigns the letter A to grade variable
            Grade = "D+";
        } else if (inputOfGrade >= 60) {
            //assigns the letter A to grade variable
            Grade = "D";
        } else if (inputOfGrade >= 0) {
            //assigns the letter A to grade variable
            Grade = "F";
        } else {
            Grade = "Error";
        }
        System.out.println("Your grade is " + Grade + ".");

    }
}