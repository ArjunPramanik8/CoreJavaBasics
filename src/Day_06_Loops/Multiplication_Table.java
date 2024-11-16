package Day_06_Loops;
import java.sql.SQLOutput;

public class Multiplication_Table
{
    public static void main(String[] args) {

        int number =5; //change this for a different table

        //Loop to print multiplication table from 1 to 10
        for (int i = 0; i <= 10; i++)
        {
            int product= number * i;
            System.out.println(number +"*"+ i +"="+ product);
            
        }
    }
}
