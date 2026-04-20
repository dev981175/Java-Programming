// Write a Java program to extract the names of all students from a list of Student objects using map().
import java.util.*;
import java.util.stream.*;
class Student
{
    int id;
    String name;
    Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class p103 
{
    public static void main(String[] args) 
    {
        List<Student> stud=Arrays.asList(
            new Student(1, "xyz"),
            new Student(2, "alice"),
            new Student(3, "asd")
        ); // This list is not a modifible list this implies that we cannot modify the list 
        List<String> names=stud.stream().map(s->s.name).collect(Collectors.toList());
        System.out.println(names);
    }   
}