public class tasksheet123 {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor to initialize attributes
    public tasksheet123(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Override toString method to print book details
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Instantiate three Book objects with different values
        tasksheet123 book1 = new tasksheet123("Java Programming", "John Smith", 2021, 39.99);
        tasksheet123 book2 = new tasksheet123("Python Basics", "Jane Doe", 2020, 29.99);
        tasksheet123 book3 = new tasksheet123("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print the details of each book using toString
        System.out.println("Book 1:\n" + book1);
        System.out.println();
        System.out.println("Book 2:\n" + book2);
        System.out.println();
        System.out.println("Book 3:\n" + book3);
    }
}