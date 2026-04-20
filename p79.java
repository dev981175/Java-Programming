// Functional Interface
// It is an interface that contains exactly one abstract method. It can have default and static methods, but only one abstract method.
// @FunctionalInterface annotation ensures that an interface cannot have more than one abstract method. If multiple abstract methods are present, the compiler throws an "Unexpected@FunctionalInterface annotation" error.
// Annotation : @FunctionalInterface
// For Ex: 
// @FunctionalInterface
// Interface myInterface { Body}
// Lambda Expression: It is an anonymous function that provides a shorter syntax to implement a functional interface.
// Lambda Expression has 3 main parts:
// 1. Parameter List
// For Ex: (or syntax of Lambda Expression)
// (parameters)->(expression)
// This is an example of Multiple Lambda Expression
@FunctionalInterface
interface add
{
    int addition(int a, int b);
}
public class p79 
{
    public static void main(String[] args) 
    {
        add a1=(a,b)->a+b; // Lambda Expression to add two numbers
        int result=a1.addition(10, 20);
        System.out.println("Sum: "+result);
    }   
}