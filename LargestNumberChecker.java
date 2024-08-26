import java.util.Scanner;

public class LargestNumberChecker {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter the first number : ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = s.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = s.nextInt();

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            // Determine the largest number
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            // Output the largest number
            System.out.println("The largest number is : " + largest);
        }
    }
}