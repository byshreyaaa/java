import java.lang.*;
import java.util.Scanner;
public class Cal
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();

        System.out.println("[1] Addition");
        System.out.println("[2]Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("Enter your choice");

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Result: "+num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println("Result: "+num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println("Result: "+num1+" * "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println("Result: "+num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
    

