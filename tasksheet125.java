// Base class Vehicle
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class Car that extends Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor for Car class
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);  // Call the constructor of the Vehicle class
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details of the Car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class tasksheet125 {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car = new Car("Toyota", "Camry", 2022, 4);
        
        // Display the details of the car
        car.displayDetails();
    }
}
