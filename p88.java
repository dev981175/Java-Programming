// In Java 8, interfaces were enhanced to include static methods.
// A static method in an interface contains complete implemetation and belongs only to the interface.
interface inter3
{
    static int add(int x, int y)
    {
        return x+y;
    }
}
public class p88 implements inter3 
{
    public static void main(String[] args) 
    {
        System.out.println(inter3.add(4,5));
    }   
}