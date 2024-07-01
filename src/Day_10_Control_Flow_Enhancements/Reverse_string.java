package Day_10_Control_Flow_Enhancements;

public class Reverse_string {

    public static void main(String[] args) {

        String s ="Accenture";
        int len = s.length();
        String reverse ="";
        for (int i = len-1; i >= 0 ; i--)
        {
            reverse= reverse + s.charAt(i);

        }
        System.out.println(reverse);
    }
}
