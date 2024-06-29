package Day_09_Methods;

public class Area_Calculator_Method {

    public static double calculateArea(int length, int breadth)
    {
        return length * breadth;
    }

    public static void main(String[] args) {

        double Area= calculateArea(20,5);
        System.out.println("Area= "+ Area );
    }
}
