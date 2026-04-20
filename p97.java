// Switch Expression(New Switch Case)
// It is an enhanced version of traditional switch satement. Unlike traditional switch, switch expression returns a value.
// Earlier version of java supported switch only as a statement, which meant it was used for control produce a value  
import java.util.*;
public class p97 
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
        int result=switch (c) {
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> a/b;
            default -> -1;
        };
        System.out.println(result);
        
        System.out.print("Enter the day: ");
        String s=sc.next();
        int day=switch(s){
            case "monday","friday","sunday","MONDAY","FRIDAY","SUNDAY" -> 6;
            case "tuesday","TUESDAY" -> 7;
            case "wednesday","WEDNESDAY" -> 9;
            case "thursday","saturday","THURSDAY","SATURDAY" -> 8;
            default -> -1;
        };
        System.out.println(day); 
    }   
}