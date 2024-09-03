package Question_Solutions;

import java.util.Scanner;

public class Fibonacci_Series
{

    public static void main(String[] args) {

        //Enter the count for the series
        System.out.println("Please enter the final count of the series");
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();

        int n1=0,n2=1,n3;

        //printing the initial fibonacci series
        System.out.print("The Fibonacci series is as follows  "+ n1+" ,"+n2+", ");

        for (int i = 2; i <=c ; i++)
        {
            n3=n1+n2;
            System.out.print(n3+", ");
            n1=n2;
            n2=n3;
        }

    }
}
