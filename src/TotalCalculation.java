import java.io.*;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args) throws FileNotFoundException {
        File items = new File("items.txt");
        File total = new File("total.txt");
        double valueOne = 10.88;
        double valueTwo = 5.62;
        double valueThree = 42.18;
        double valueFour = .99;
        double valueFive = 12.37;
        double subtotal =0;
        double currentValue;
        double tax = 0.053;

        try(FileOutputStream fileOutputStream = new FileOutputStream(items)){
            Scanner console = new Scanner(System.in);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(valueOne);
            printStream.println(valueTwo);
            printStream.println(valueThree);
            printStream.println(valueFour);
            printStream.println(valueFive);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner in = new Scanner(items);
        while(in.hasNextDouble()){
            currentValue = in.nextDouble();
            subtotal = subtotal + currentValue;

        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(total)){
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.printf("The sub-total is %.2f \n" , subtotal);
            printStream.printf("The tax is %.2f \n" , (subtotal * tax));
            double totalPlusTax = subtotal*tax;
            double finalTotal = totalPlusTax + subtotal;
            printStream.printf("The total is %.2f \n" , finalTotal);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
