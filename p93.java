// Text Block are an alternative form of Java string representation introduced to simplify the creation of multi-line string literals.
// A text black can be used anywhere a traditional double-quoted string literal is used.
// A text block begins with three double-quoted characters.
public class p93 
{
    public static void main(String[] args) 
    {
        // Text Block : It is used to write multiple string in the different line without creating the multiple strings.
        // Also when we want to display the address of a particular house then there is a problem while declaring the next line string, therefore we use Text Block.
        String s="""
                11/2,
                kiet, muradnagar
                ghaziabad
                """;
        System.out.println(s);
    }   
}