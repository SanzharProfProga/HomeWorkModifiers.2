import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a = new Scanner(System.in).nextInt();
        System.out.println("Area = PI * " + a + " * " + a + " = " +Circle.area(a));
        System.out.println("Circumference = PI * 2 * " + a + " = " + Circle.circumference(a));
    }
}