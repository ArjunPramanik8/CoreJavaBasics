package Day_06_Loops;

public class Sum_of_Numbers_Loop
{
    public static void main(String[] args) {

        int sum=0;

        for (int i = 0; i <10 ; i++)
        {
            sum+=i;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
