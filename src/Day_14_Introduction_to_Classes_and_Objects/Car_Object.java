package Day_14_Introduction_to_Classes_and_Objects;

public class Car_Object
{
    String model;
    int year;
    double price;

    public Car_Object(String model, int year, double price) { // Constructor to initialize object
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car_Object myCar = new Car_Object("Toyota Camry", 2023, 25000.00); // Create a Car object
        myCar.printDetails();
    }
}
