// Stream represents on a sequence of objects.
// Stream operates on a data source, such as an array or a collection
// A stream never provides storage for the data. It simply moves data, possibly filtering, sorting.
// A stream operation by itself does not modify the data source. For example: sorting a stream does not change the order of the source. Rather, storing a stream results in the creation of a new stream.
// Processing flow:
// 1. Create a Stream
// 2. Apply Intermediate Operation
// 3. Apply Terminal Operation
// Operations: 
// 1. Intermediate Operation : filter(),sorted(),distinct(),limit(),skip()
// 2. Terminal Operation : forEach(),collect(),count(),max(),min(),reduce(),toArray()
// It is mandatory to have terminal operation for the working of stream
// Methods to create Stream: 
import java.util.*;
import java.util.stream.*;
public class p102 
{
    public static void main(String[] args) 
    {
        // 1st method to create a stream
        int arr[]={3,4,7,89,43,80};
        IntStream s=Arrays.stream(arr); // Creation of the Stream
        s.forEach(x->System.out.println(x));
        // 2nd method to create a stream uisng Value
        Stream<Integer> s2=Stream.of(2,6,45,34);
        s2.forEach(x->System.out.println(x));
        // 3rd method to create a stream using collections
        List<Integer> l3=new ArrayList<>();
        l3.add(45);
        l3.add(89);
        l3.add(20);
        l3.add(70);
        Stream<Integer> s3=l3.stream();
        // s3.forEach(x->System.out.println(x)); // For normal Printing
        // we can also terminate this above line as instead of creating a Stream<Integer> s3=l3.stream(); we use:
        // List<Integer> l4=l4.stream().filter(x->x%2==0).collect(Collectors.toList()); with this we are not required to write Stream<Intger> s3=l3.stream();
        List<Integer> l4=s3.filter(x->x%2==0).collect(Collectors.toList()); // Filter is used just like a condition in filter we give condition if it is true then it will move to the terminal operation, since the filter is a intermediate operation therfore we require a termianl operation to end it.
        // It is not necessary to use only collect method after filter, the only thing is that after filter we have to use any method of the terminal operation. Like: 
        // List<Integer> l4=s3.filter(x->x%2==0).forEach(x->System.out.println(x)); 
        // This is also correct
        System.out.println(l4);
        // If we want to perform some task which is being filterd on the filtered data, therefore we use map function to pass the task or the working. For ex: square of the even numbers.
        // List<Integer> l4=l3.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList()); // Here map will the working of the data which is being filtered and after give their working.
        // If we want to square all the elements not only the numbers which is divisible by the 2, then :
        // List<Integer> l4=l3.stream().map(x->x*x).collect(Collectors.toList());
    }   
}