package Day_12_String_Formatting;

public class Product_Details {

    public static void main(String[] args) {

        String name = "Headphones";
        double price = 49.99;
        int quantity = 2;

    
        // Format output string with placeholders and formatting
        String productDetails = String.format("Product: %s\nPrice: $%.2f\nQuantity: %d",
                name, price, quantity);

        System.out.println(productDetails);
    }

}
