public class tasksheet114 {
    public static void main(String[] args) {
        //Create int varialble named check_number with value of 10.
        int check_number = 10;
        String message;

        //Using For loop to check/print if number is odd or even
        for (int i = 1; i <= check_number; i++) {
            message = (i % 2 == 0) ? i + " is even number." : i + " is odd number.";
            System.out.println(message);
        }
    }
}
