package Test;
import java.util.*;

public class multiplication {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();

        double product=a*b;
        System.out.println("The final product = " + product);
        sc.close();
    }
    
}
