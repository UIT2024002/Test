package Test;
import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: Add.add(); break;
                case 2: Substraction.sub(); break;
                case 3: Multiply.mul(); break;
                case 4: Division.div(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
