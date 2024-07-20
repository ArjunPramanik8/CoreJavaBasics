package Day_5_Conditional_Statements;
import java.util.Scanner;

public class Discount_Calculator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Original Price: ");
        double price = sc.nextDouble();

        System.out.println("Enter the discount percentage (0-100): ");
        double discount = sc.nextDouble();

        double discount_amount= price * (discount/100);
        double final_Price= price-discount_amount;
        System.out.println("Final Price After Discount: RS"+ final_Price);

        sc.close();

    }


}
