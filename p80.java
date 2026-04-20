// There are 4 types of lambda expressions based on the number of parameters
// 1. Lambda Expression with Zero Parameters
// Syntax: ()->statement;
@FunctionalInterface
interface Zero
{
    //void display();
    public String display();
}
public class p80 
{
    public static void main(String[] args) 
    {
        Zero z1=()->{
            System.out.println("Zero Parameter Lambda Expression");
            System.out.println("Hello");
            return "world";
        };
        String s=z1.display();
        System.out.println(s);
        //z1.display();
        Zero z2=()->{
            return"hello world";
        };
        // We can also write Zero z2=()->"hello world";
        String s1=z2.display();
        System.out.println(s1);
    }   
}