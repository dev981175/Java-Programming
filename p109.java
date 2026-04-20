// Count total elements using reduce() (without using count())
import java.util.*;
import java.util.stream.*;
public class p109 
{
    public static void main(String[] args) 
    {
        int count=0;
        List<Integer> l1=List.of(10,34,56,34,72);
        int y=l1.stream().reduce(0,(m,n)->m+1);
        // int y=l1.stream().reduce(0,count++); // We cannot use this as reduce method will take binary or 2 operations but here only count is there, therefore it will give error
        System.out.println(y);
    }   
}