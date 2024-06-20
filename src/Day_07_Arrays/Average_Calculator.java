package Day_07_Arrays;

public class Average_Calculator {
    public static void main(String[] args) {

        int[] n = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Array of numbers
        int s=0;

        for (int i = 0; i <n.length ; i++)

        {   s+=n[i];

        }
 double average=(double) s/ n.length;
        System.out.println("Average of the given number is:" + average);
    }

}