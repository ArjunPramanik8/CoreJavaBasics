package Day_4_UserInput;

import java.util.Scanner;

public class Name_Greeter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter you name");
        String name = sc.nextLine();
        
        System.out.println("Hello,"+ name + "!");

        sc.close();
    }
}
