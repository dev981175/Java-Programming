// Expression with 1 Parameter
interface one
{
    public int display(int x);
}
public class p81 
{
    public static void main(String[] args) 
    {
        one n= (a) -> a * a;
        System.out.println("Square: "+n.display(4));
    }
}