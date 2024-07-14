package Day_5_Conditional_Statements;
import java.util.Scanner;

public class Even_Odd_Checker 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        int Number = sc.nextInt();

        if(Number%2==0)
        {
            System.out.println(Number + " is Even");
        }
        else
        {
            System.out.println(Number + " is Odd");
        }

        sc.close();
    }


}
