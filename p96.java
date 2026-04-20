// Old Switch Case
import java.util.*;
public class p96 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the Character you want to perform : ");
        String c=sc.next();
        switch (c) {
            case "+":
                System.out.print("Addition of the number is : "+(a+b));
                break;
            case "-":
                System.out.print("Subtraction of the number is: "+(a-b));
                break;
            case "*":
                System.out.print("Multiplication of the number is: "+(a*b));
                break;
            case "/":
                System.out.print("Division of the number is: "+(a/b));
                break;
            default:
                System.out.print("Please enter the correct choice");
                break;
        }
    }   
}