import java.util.*;
public class Division{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two numbers for division: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        while(b==0){
            System.out.println("Error! Divide by Zero not possible.\nEnter another number.");
            b= sc.nextFloat();
        }
        System.out.println("Division Result: "+(a/b));
    }
}