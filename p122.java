// Callable Statement
// It is a JDBC interface used to call stored procedures from Java.
// Stored procedures are precompiled SQL programs stored inside the database.
// Syntax:
    // CallableStatement cs=conn.prepareCall("data");

// Predict the Output:

// 1. 
    // List<Integer> list=Arrays.asList(34,45,2,13,20);
    // list.stream()
    // .filter(x-> x>4)
    // .sorted((a,b)->b-a) // if(b-a) is used then it will return in descending order and if(a-b), then it will return in ascending order
    // .forEach(System.out::print)
// Output: 45,34,20,13

// 2. 
    // List<Integer> list=Arrays.asList("java","python");
    // list.stream()
    // .map(String::length)
    // .forEach(System.out::print);
// Output: 46

// 3. 
    // List<Integer> list=Arrays.asList(1,2,3,4,5);
    // list.stream()
    // .skip(2)
    // .limit(2)
    // .forEach(System.out::print);
// Output: 34

//4. 
    // long count=Stream.of(2,4,6,7).filter(x->x%2==0).count();
    // System.out.println(count);
// Output: 3

// 5. 
    // List<Integer> list=Arrays.asList(1,2,3);
    // int res=list.stream()
    // .reduce(5,(a,b)->a+b);
    // System.out.println(res);
// Output: 11

// 6. 
    // List<Integer> list=Arrays.asList();
    // long count=list.stream().count();
    // System.out.println(count);
// Output: null pointer exception

// 7.
    // List<Integer> list=Arrays.asList(1,2,3,4);
    // int sum=list.stream()
    // .filter(x->x>2)
    // .reduce(0,Integer::sum);
    // System.out.println(sum);
// Output: 7

// 8. 
    // List<Integer> list=Arrays.asList(10,20,30);
    // int res=list.stream()
    // .reduce(100,(a,b)->a-b);
    // System.out.println(res);
// Output: 40

// 9. 
    // List<Integer> list=Arrays.asList("a","bb","ccc");
    // list.stream()
    // .filter(s->s.length()>1)
    // .forEach(System.out::print);
// Output: bbccc

// 10.
    // Stream<Integer> s=Stream.of(1,2,3);
    // System.out.println(s.count());
    // System.out.println(s.count());
// Output: Compilation Error

// 11.
    // List<Integer> list=Arrays.asList(1,2,3,4);
    // list.stream()
    // .filter(x->{
    // System.out.print(x);
    // return x%2==0;
    // })
    // .map(x->x*10)
    // .forEach(System.out::print)
// Output: 
public class p122 
{
}