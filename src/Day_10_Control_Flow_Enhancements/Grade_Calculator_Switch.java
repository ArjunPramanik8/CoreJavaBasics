package Day_10_Control_Flow_Enhancements;
import java.io.*;
import java.util.Scanner;

public class Grade_Calculator_Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (percentage): ");
        int grade = scanner.nextInt();

        String letterGrade = getLetterGrade(grade); // Call the method
        System.out.println("Your letter grade is: " + letterGrade);

        scanner.close();
    }

    public static String getLetterGrade(int grade) {
        String letterGrade;
        switch (grade / 10) {
            case 10:
            case 9:
                letterGrade = "A";
                break;
            case 8:
                letterGrade = "B";
                break;
            case 7:
                letterGrade = "C";
                break;
            case 6:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
        }
        return letterGrade;
    }

}
