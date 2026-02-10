package Test;
import java.util.Scanner;

public class Multiply {
    public static void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Multiplication = " + (a * b));
    }
}
