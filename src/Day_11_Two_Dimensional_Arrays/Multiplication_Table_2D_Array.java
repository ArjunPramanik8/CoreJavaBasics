package Day_11_Two_Dimensional_Arrays;

public class Multiplication_Table_2D_Array {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10]; // 10x10 table

        // Fill the table with multiplication results
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplicationTable[i][j] + "\t"); // Tab between values
            }
            System.out.println(); // New line after each row
        }
    }
}
