package Test;
import java.util.Scanner;

public class Division {
    public static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        while(b==0){
            System.out.print("\nError! Divide by zero not possible.\nEnter another number:- ");
            b = sc.nextFloat();
        }
        System.out.println("Division = " + (a / b));
    }
}
