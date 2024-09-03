import java.util.Scanner;

public class Task119 {

    public static void main(String[] args) {
       
        //Scanner for user input
        Scanner userInput = new Scanner(System.in);

        //1st Number
        System.out.print("1ST NUMBER : ");
        int num1 = userInput.nextInt();
        //2nd Number
        System.out.print("2ND NUMBER : ");
        int num2 = userInput.nextInt();

        //4 Basic Arithmetic Operations
        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);

        // Print the results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
