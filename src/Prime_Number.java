import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args) {

        // accepting the number
        System.out.println("Please enter the number to be checked:");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 2; i < num ; i++)
        {
            if (num % i == 0)
            {
                System.out.println("Non Prime number");
            }
            else
            {
                System.out.println("Prime number");
            }

        }



    }
}
