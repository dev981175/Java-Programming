// Use forEach() to print strings with an exclamation mark appended.
import java.util.*;
public class p91 
{
    public static void main(String[] args) 
    {
        List<String> l=new ArrayList<>();
        l.add("alex");
        l.add("hi");
        l.forEach(s->System.out.println(s+"!"));
    }   
}