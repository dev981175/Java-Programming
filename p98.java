// Yield Keyword is used inside a switch expression when a case block contains multiple statements and needs to return a value.
// The arrow syntax, cannot be used directly because more than one statement must be executed before producing the result. The yield keyword explicitly returns a value from a switch expression case block.
// The yield keyword cannot be used outside a switch expression. It is not a replacement for return and cannot terminate a method. It only provide a value to the switch expression. It is restricted onlt to switch expression.
// Bsicaly yield keyword is used to add multiple line in a particular case.
import java.util.*;
public class p98 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month=sc.next();
        String season=switch(month){
            case "november","december","january","february"->{
                System.out.println("greetings of the day");
                yield month+" is winter"; // Work just like return function // This will also give the output
            }
            case "june","july"->{
                System.out.println("greetings of the day");
                yield month+" is summer";
            }
            default->{
                yield "Invalid month";
            }
        };
        System.out.println(season); // For printing the yield method we have to print the string in which the switch statement is written as the yield returns the value, therefore the value is returned to the string. Therefore, we have to print the string to execute the yield method.
        
        System.out.print(" Enter the number: ");
        int number=sc.nextInt();
        String output=switch(number){
            case 1: {
                yield "one";
            }
            case 2: {
                yield "two";
            }
            default: {
                yield "invalid";
            }
        };
        System.out.println(output);
    }
}