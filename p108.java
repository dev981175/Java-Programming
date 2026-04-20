// Find maximum number using reduce()
import java.util.*;
import java.util.stream.*;
public class p108 
{
    public static void main(String[] args) 
    {
        List<Integer> l1=List.of(10,34,56,34,78);
        int max=l1.stream().reduce(0,Integer::max);
        System.out.println(max);
    }   
}