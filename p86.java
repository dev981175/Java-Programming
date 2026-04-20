// Method Reference using Constructor
interface int3
{
    student get();
}
class student
{
    student()
    {
        System.out.println("Creating student");
    }
}
public class p86 
{
    public static void main(String[] args) 
    {
        int3 i3=student::new; // To create an object when using constructor reference // This is same as ref=()->new student
        i3.get();
    }   
}