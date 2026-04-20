// For-Each Loop
import java.util.*;
public class p90 
{
    public static void main(String[] args) 
    {
        List<Integer> l=new ArrayList<>();
        l.add(34);
        l.add(10);
        l.add(45);
        l.add(56);
        l.forEach(i->System.out.println(i)); 
        l.forEach(System.out::println); // Using Method Reference
        l.forEach(i->
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        ); // When using multiple statements
    }   
}