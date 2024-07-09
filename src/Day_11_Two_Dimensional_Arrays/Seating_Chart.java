package Day_11_Two_Dimensional_Arrays;

public class Seating_Chart {

    public static void main(String[] args) {
        String[][] seatingChart = {
                {"John", "Alice", "Bob"},
                {"Mary", "David", "Emily"}
        }; // A simple 2x3 seating chart

        // Print the seating chart with row and seat labels
        for (int i = 0; i < seatingChart.length; i++) { // Outer loop for rows
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seatingChart[i].length; j++) { // Inner loop for seats
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
    }
}
