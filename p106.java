// toArray() Method:
// It is a terminal operatin, which is used to convert stream into array.
import java.util.*;
import java.util.stream.*;
public class p106 
{
    public static void main(String[] args) 
    {
        List<Integer> l1=List.of(10,30,34,45,23,78,10);
        Object ar=l1.stream().toArray();
        System.out.println(ar); // This method is used to return string, through which it will not give the correct output.
        System.out.println(Arrays.toString(ar)); // This statement will give the actual data // Therefore for printing we use this
    }   
}