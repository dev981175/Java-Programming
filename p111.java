import java.util.*;
import java.util.stream.*;
public class p111 
{
    public static void main(String[] args) 
    {    
        List<Integer> l1=List.of(34,56,23,56,89,12);
        // Perform Sorting
        // List<Integer> l2=l1.stream().sorted(Comparator.reverseOrder()).toList(); // if we can write only sorted comparator then it will arrange in ascending order but if we write reverse order then it will arrange in descending order.
        List<Integer> l2=l1.stream().sorted((x,y)->x.compareTo(y)).toList(); // This arrange in ascending order, if change x or y position then it will arrange in descending order.
        int minimum=l1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(l2);
        System.out.println(minimum);
        int maximum=l1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(maximum);
    }   
}