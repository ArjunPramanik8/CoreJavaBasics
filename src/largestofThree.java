import java.util.Scanner;

public class largestofThree {

    public static void main(String[] args) {

        System.out.println("Please enter the first number");
        Scanner sc1 = new Scanner(System.in);
        int Num1= sc1.nextInt();

        System.out.println("Please enter the second number");
        Scanner sc2 = new Scanner(System.in);
        int Num2= sc2.nextInt();

        System.out.println("Please enter the third number");
        Scanner sc3 = new Scanner(System.in);
        int Num3= sc3.nextInt();




        int largest = (Num1>Num2)? (Num1>Num3?Num1:Num3):(Num2>Num3?Num2:Num3);
        System.out.println("The largest  number is: " + largest);

    }
}
