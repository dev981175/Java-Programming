// reduce() Method:
// It is a terminal operation used to combine all elements of the stream into a single result.
import java.util.*;
import java.util.stream.*;
public class p107 
{
    public static void main(String[] args) 
    {
        List<Integer> l1=List.of(10,34,56,34,78);

        // 1st way: Reduce without Identity Value(Starting Value)

        // l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println); // Reduce method will work for 2 variable or numbers. // ifPresent() function is used when there is some value then it will return 
        Optional x=l1.stream().reduce((e1,e2)->e1+e2); // This is the another method to return, reduce has default return type that is Optional which is used to return the value, if value exists then return or if the value is not present then it will print empty.
        System.out.println(x);

        // 2nd way: Reduce with Identity Value(Starting Value)

        int sum=l1.stream().reduce(0,(e1,e2)->e1+e2); // Here if we want to add then it will take first value as 0 and second value as 10 // Here if we want string concatenation then instead of 0 we can write " ", this will return string with concatenation.
        System.out.println(sum); // This will give the same output which is give above
    }   
}