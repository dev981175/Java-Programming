// In Java 9, a private method is used inside an interface only to support default and static method.
// It cannot be accessed outside the interface
// It cannot be overriden
// It used only for code reuse inside interface
interface inter4
{
    private void checkbalance()
    {
        System.out.println("checking balance");
    }
    default void deposit()
    {
        System.out.println("money deposited");
        checkbalance();
    }
}
public class p89 implements inter4
{
    public static void main(String[] args) 
    {
        p89 obj=new p89();
        obj.deposit();
    }   
}