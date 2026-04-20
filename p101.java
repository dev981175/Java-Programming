// Write a java program using a lambda expression to compare two integers and return the greater number.
import java.util.*;
interface lambda
{
    int max(int x, int y);
}
public class p101 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x=sc.nextInt();
        System.out.print("Enter the second number: ");
        int y=sc.nextInt();
        lambda l=(a,b)-> a > b? a : b;
        int result=l.max(x, y);
        System.out.println("Greatest Number is: "+ result);
    }   
}