import java.util.Scanner;

public class Fibonacci_series
{
    public static void main(String[] args) {


        System.out.println("Please enter the limit of the series");
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int a = 0, b=1;
        for (int i = 0; i <n ; i++)
        {
            System.out.print(a+",");
            int s= a+b;
            a=b;
            b=s;
        }
    }
}
