import static java.lang.Math.*;
import java.util.Scanner;

public class tasksheet121 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = userInput.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = userInput.nextInt();

        System.out.println();
        
        System.out.println("--- RESULTS ---");
        System.out.println("Addition       : " + add(a, b));
        System.out.println("Subtraction    : " + subtract(a, b));
        System.out.println("Multiplication : " + multiply(a, b));
        System.out.println("Division       : " + divide(a, b));
    }

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }
}