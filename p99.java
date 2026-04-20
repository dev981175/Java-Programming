// Records Class (With the Help of Encapsulation or replicate Encapsulation)
// (For Records, please refer the Encapsulation class also)
// Records are immutable means the value which is assigned cannot be changed
// Records fields are by default private and final.
// Records is a special type of class used mainly to store data.
record Student(int id,String name) 
{
    public void show()
    {
        System.out.println("inside record");
    }
}
public class p99 
{
    public static void main(String[] args) 
    {
        Student s1=new Student(1,"ram");
        System.out.println(s1.id()+" "+s1.name());
        s1.show();
        Student s2=new Student(2,"xyz");
        System.out.println(s2); // This will print the output which is print in the encapsulation with the help of Override
    }   
}