import java.util.*;
import java.util.stream.*;
public class p105 
{
    public static void main(String[] args) 
    {
        // Distinct Method: 
        List<Integer> l1=List.of(10,30,45,56,10,6,34,30);
        l1.stream().distinct().forEach(System.out::println);
        // Also we can use
        List<Integer> l2=l1.stream().distinct().toList();
        System.out.println(l2);
        // Here distinct is used is to remove the duplicates elements in the list

        // Skip Method: 
        List<Integer> l3=l1.stream().distinct().skip(3).toList();
        // Skip is the method which is used to skip some values and return other values
        System.out.println(l3);

        // Limit Method:
        List<Integer> l4=l1.stream().skip(1).limit(4).toList();
        // Limit is the method which is used to limit or give the range that till only the value is to be printed
        System.out.println(l4);

        // Count Method:
        // Count method is used to count that how many elements are there in the list
        long c=l1.stream().count();
        System.out.println(c);
        long c2=l1.stream().skip(1).limit(4).count();
        System.out.println(c2);
        // In this c2 the count method is only count to the previous function element rather then the element present in the list that is its previous function is limit therefore it will give the limit value rather then the element present in the list.
        // Therefore the output of the c2 is 4.
    }   
}