package Day_12_String_Formatting;
public class Invoice_Generator {

    public static void main(String[] args) {
        String[] items = {"Shirt", "Pants", "Shoes"};
        double[] prices = {19.99, 29.99, 49.99};
        int[] quantities = {1, 2, 1};

        double total = 0.0;

        System.out.println("Invoice\n");
        System.out.println("Item\t\tPrice\tQuantity\tTotal");
        System.out.println("----------------------------------");

        // Calculate total price for each item and overall total
        for (int i = 0; i < items.length; i++) {
            double itemTotal = prices[i] * quantities[i];
            total += itemTotal;

            System.out.println(items[i] + "\t$" + prices[i] + "\t" + quantities[i] + "\t$" + String.format("%.2f", itemTotal));
        }

        System.out.println("----------------------------------");
        System.out.println("Total:\t\t\t$" + String.format("%.2f", total));
    }
}