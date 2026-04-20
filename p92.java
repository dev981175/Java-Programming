// Local Variable Type Inference
// It was introduced in Java 10 to reduce verbosity in code and improve readibility. With this feature, the compiler automatically infers the data type of a local variable from the assigned value, removing the need to explicitly mention the type.
// The keyword used for local variable type inference is var
// The variable must be initialized at the time of declaration, otherwise the compiler cannot determine the type.
// Local Variable type inference is allowed only for local variables. It cannot be used for class-level variables, instance variables, method parameters, or return types.
// Syntax :
// var variablename = value;
// It is basically works just like a datatype which can store int,string etc.
class Test2
{
    Test2() // Use of var keyword in the constructor
    {
        var x=23;
        System.out.println("Constructor Value is "+x);
    }
    void check() // We can also declare the string instead of void and return the value of s, but we cannot use var check and we cannot pass the var as an parameter in the check function.
    {
        var s="hello";
        System.out.println(s);
    }
}
public class p92 
{
    public static void main(String[] args) 
    {
        Test2 obj =new Test2();
        obj.check();
        // We can use var in the loop also
        for(var i=0;i<=4;i++)
        {
            System.out.println(i);
        }
    }   
}