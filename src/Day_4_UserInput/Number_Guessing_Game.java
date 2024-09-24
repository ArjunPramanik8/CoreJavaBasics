package Day_4_UserInput;

import java.util.Scanner;

public class Number_Guessing_Game
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int targetNumber = 10; //Change this for different difficulty

        System.out.println("Please Guess your number between 1 to 20");
        int guess = sc.nextInt();


        if(guess == targetNumber)
        {
            System.out.println("Congratulations! You guessed the number.");
        }
        else{
            System.out.println("Sorry! Incorrect guess. Please try again!");
        }

        sc.close();
    }
}
