// Upcasting 
// It is the process of casting a child object to a parent reference variable.
// Syntax: ParentClass obj=new ChildClass();
// You can only call methods, defined in the parent class, but if those methods are overriden in the child class, the child's version is executed

// Dynamic Method Dispatch
// It is a mechanism where a call to an overriden method is resolved at runtime rather than compile time.
// When an overriden method is called through a parent reference(after upcasting), the Java Virtual Machine(JVM) determines which version of the method to execute based on the actual object type, not the reference type.
// It is essential for implementing run-time polymorphism.
class animal
{
    void sound()
    {
        System.out.println("Animal sound");
    }
}
class dog extends animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class p95
{
    public static void main(String[] args) 
    {
        animal obj=new dog(); // Upcasting
        obj.sound(); // Dynamic Method Dispatch
    }
}