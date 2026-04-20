// Write a java program to replace all negative numbers with 0 and find the sum using reduce()
import java.util.*;
import java.util.stream.*;
public class p110 
{
    public static void main(String[] args) 
    {
        List<Integer> l1=List.of(34,-90,34,23,-9);
        int s=l1.stream().map(a->a<0?0:a).reduce(0,Integer::sum);
        System.out.println(s);
    }   
}