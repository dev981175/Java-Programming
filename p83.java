// Method Reference is a short and clean way to refer to an existing method without calling it.
// It is mainly used to replace lambda expressions when the lambda only calls one method.
// 1. Method references using static method
    // Syntax:
    // className::methodName
// 2. Method references using with instance method
    // Syntax:
    // objectReference::methodName
// 3. Method references to an Instance Method of an Arbitary Object

//1. Method reference using static method
@FunctionalInterface
interface int1
{
    void show();
} 
class Demo
{
    public static void display()
    {
        System.out.println("Reference to static method");
    }
    // public void print()
    // {
    //     System.out.println("Reference without static");
    // }
}
public class p83 
{
    public static void main(String[] args) 
    {
        // Demo d = new Demo(); // This statement is only used when we created a function without static then we have to create a object for this class.
        // int1 i1=d::display; // When the object of the demo class is created then we use this statement
        int1 i1=Demo::display; // This statement is used when static function is used
        i1.show();
    }
}