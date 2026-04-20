interface calculator
{
    int calculate(int x, int y);
}
public class p82 
{
    public static void main(String[] args) 
    {
        calculator add=(a,b)->a+b;
        calculator sub=(a,b)->a-b;
        calculator mul=(a,b)->a*b;
        calculator div=(a,b)->a/b;
        System.out.println("Addition = "+add.calculate(5, 10));
        System.out.println("Subtract = "+sub.calculate(5, 10));
        System.out.println("Multiplication = "+mul.calculate(5, 10));
        System.out.println("Division = "+div.calculate(5, 10));
    }   
}