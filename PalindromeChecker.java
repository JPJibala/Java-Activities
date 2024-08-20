import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = s.nextLine();
        
        // Create a StringBuilder with the input string
        StringBuilder isPalindrome = new StringBuilder(word);
        
        // Reverse the string
        isPalindrome.reverse();
        
        // Check if the input string and the reversed string are the same
        if (word.equals(isPalindrome.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
