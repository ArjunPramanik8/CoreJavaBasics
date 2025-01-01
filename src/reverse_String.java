public class reverse_String {
    public static void main(String[] args) {

        String str= "Welcome";
        String Rev= new StringBuilder(str).reverse().toString();
        System.out.println(Rev);
    }
}
