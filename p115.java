// Result Set only work with select query
// Types of ResultSet:
// 1. Based on Cursor Movement(Type)
    // 1. Forward Only -> One Direction
    // 2. Scrollable -> Bi-Directional (forward and backward)
        // Methods:
            // 1. next() -> move forward
            // 2. previous() -> move backward
            // 3. first() -> move to first row
            // 4. last()
            // 5. absolute(int row)
            // 6. beforeFirst()
            // 7. afterLast()
// 2. Based on Concurrency(Concur/Subtype)
    // 1. Read Only
    // 2. Updatable
// By default forward only and read only apply

// Use of Scrollable: 
import java.sql.*;
public class p115 
{   
    static final String JDBC_driver="com.mysql.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost:3306/devansh";
    static final String usr="root";
    static final String pass="devansh4506";
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection(db_url,usr, pass);
            System.out.println("Connected to MySQL!");
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Through this we created a scrollable ResultSet which has the type read only // For declaring any Scrollable we use to write inside of the statement mehod
            ResultSet res=stmt.executeQuery("select * from student1");
            System.out.println("----Forward----");
            while(res.next())
            {
                System.out.println(res.getInt(1)+" -> "+res.getString(2));
            }
            System.out.println("----Baclward----");
            res.afterLast(); // Now the cursor move to the last
            while(res.previous())
            {
                System.out.println(res.getInt(1)+" -> "+res.getString(2));
            }
            res.absolute(2); // Now the resultset move to the second position and return the statement which is present in the second row // abosulte method is used to move to a specific position
            System.out.println("name at 2nd row = "+res.getString("name"));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}