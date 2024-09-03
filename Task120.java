public class Task120 {
    public static void main(String[] args) {
        int totalSum = calculateSum(4, 5, 10);
        System.out.println("Total Sum: " + totalSum);
    }

    public static int calculateSum(int... numbers) {
        int totalSum = 0;

        for (int number : numbers) {
            int cumulativeSum = 0;
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + number + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }
}