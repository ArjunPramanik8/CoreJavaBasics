package Day_13_User_Defined_Functions;

public class Circle_Area_Calculator {

    public static double calculateArea(double radius) {
        if (radius < 0) { // Error handling for negative radius
            return -1; // Indicate error (optional, can throw an exception)
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateArea(radius);

        if (area != -1) {
            System.out.println("The area of the circle is: " + area);
        } else {
            System.out.println("Error: Invalid radius (negative value).");
        }
    }
}
