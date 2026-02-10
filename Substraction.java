package Test;
import java.util.Scanner;

public class Substraction {
    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Subtraction = " + (a - b));
    }
}
