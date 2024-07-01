package Day_10_Control_Flow_Enhancements;

public class Multiplication_Table_Method {

    public static void main(String[] args) {
        printMultiplicationTable(5); // Call the method with an argument
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
