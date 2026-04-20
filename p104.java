// Write a java program to filter employees whose salary is greater than 6000 and return their names in uppercase using map().
import java.util.*;
import java.util.stream.*;
class Emp
{
    String name;
    double salary;
    Emp(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class p104 
{
    public static void main(String[] args) 
    {
        List<Emp> e=Arrays.asList(
            new Emp("Devansh",500000),
            new Emp("Deepanshu",100000)
        );
        List<String> empNames=e.stream().filter(x->x.salary>=6000).map(x->x.name.toUpperCase()).collect(Collectors.toList());
        System.out.println(empNames);
    }   
}