// 3. Reference to an Instance Method of an Arbitary Object
@FunctionalInterface
interface int1
{
    void show();
}
interface int2
{
    String cal(String s);
}
class Demo
{
    public void display()
    {
        System.out.println("Reference to static method");
    }
}
public class p85 
{
    public static void main(String[] args) 
    {
        Demo d=new Demo();
        int1 i1=d::display;
        i1.show();
        int2 i2=String::toUpperCase;
        System.out.println(i2.cal("java"));
    }   
}