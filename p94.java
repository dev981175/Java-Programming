// A sealed class limits which classes are allowed to extend it.
// Only the classes explicitly specified by the programmer are permitted to inherit from a sealed class. Any other class attempting to extend a sealed class will result in a compile-time error.
// Steps to create a sealed class:
// 1. define the class that needs restricted inheritance
// 2. declare the class using the sealed keyword.
// 3. specify the permitted subclass using the permits keyword
// 4. ensure that all permited subclasses are declared as sealed,non-sealed, or final.
// 5. each permitted subclass must be declared as sealed,non-sealed, or final.
sealed class vehicle permits car,bike
{
    public void start()
    {
        System.out.println("Vehicle Started");
    }
}
// The class car with a sealed direct supertype vehicle should be declared either final, sealed, or non-sealed
// But if we write final then no inheritance is performed by the class and if we write non-sealed then we can perform inheritance by the class
final class car extends vehicle
{
    public void run()
    {
        System.out.println("Car is running");
    }
}
// The class bike with a sealed direct supertype vehicle should be declared either final, sealed, or non-sealed
non-sealed class bike extends vehicle
// We can also write sealed class bike extends vehicle but we have to permit another class as permits Scooter // then the class will be
// sealed class bike extends vehicle permits Scooter
// Now we have to create a another class with name Scooter and also we have to declare Scooter class either final or non-sealed.
// And the scooter class will look like
// non-sealed class Scooter extends Bike
{
    public void run()
    {
        System.out.println("Bike is running");
    }
}
public class p94 
{
    public static void main(String[] args) 
    {
        vehicle v=new vehicle();
        v.start();
        car c=new car();
        c.run();
        c.start();
        bike b=new bike();
        b.run();
    }   
}