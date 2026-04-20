// Write a lambda expression to implement the MathOperation functional interface that returns the square of a given integer
@FunctionalInterface
interface MathOperation
{
    int operation(int a);
}
public class p84 
{
    public static void main(String[] args) 
    {
        MathOperation square=(a)->a*a;
        System.out.println("Square = "+square.operation(7));
    }   
}