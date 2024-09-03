package Question_Solutions;

import java.util.Scanner;

public class Factorial_Method2
{
    public static int findFactorial(int n)
    {
        int f=1;
        for (int i = 1; i <= n; i++)
        {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int factorial= findFactorial(n);
        System.out.println("Factorial of "+ n + " is "+ factorial );

    }
}