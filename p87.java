// Predict the Output: 
// 1. 
// interface A
// {
//     void show();
// }
// public class Test
// {
//     public static void main(String[] args) {
//         A obj=()->System.out.println("Hello");
//         obj.show;
//     }
// }
// Output: Hello
//2. 
// interface A
// {
//     void show();
// }
// class Test
// {
//     static void display()
//     {
//         System.out.println("Hello");
//     }
//     public static void main(String[] args) {
//         A a=Test::display;
//         a.show(10);
//     }
// }
// Output: Compilation Error
// 3. 
// interface A
// {
//     void show();
// }
// public class Test
// {
//     public static void main(String[] args) {
//         A a=()->{};
//         a.show();
//         System.out.println("Done");
//     }
// }
// Output: Done
// 4. 
// class Test
// {
//     static void show()
//     {
//         System.out.println("Java");
//     }
//     public static void main(String[] args) {
//         Runnable r = Test::show;
//         r.run();
//     }
// }
// Output: Java
// 5. 
// interface A
// {
//     Student get();
// }
// class Student
// {
//     Student()
//     {
//         System.out.print("Created");
//     }
// }
// public class Test
// {
//     public static void main(String[] args) {
//         A a=Student::new;
//         a.get();
//         a.get();
//     }
// }
// Output: Created Created (No next line)

// Before Java 8,Interface in java could only have abstract methods(methods without a body), Java 8 introduced default methods in interfaces, allowing methods with a body(implementation).
// Default methods provide backward compatibility without breaking existing code.
// Default Methods in Interface
interface inter1
{
    // void show();
    default void def1()
    {
        System.out.println("Default Method inside interface1");
    }
}
interface inter2
{
    // void show();
    default void def1()
    {
        System.out.println("Default method inside interface2");
    }
}
public class p87 implements inter1,inter2
{
    public void def1()
    {
        inter1.super.def1();
        inter2.super.def1();
    }
    public static void main(String[] args) 
    {
        p87 d =new p87();
        d.def1();
    }   
}