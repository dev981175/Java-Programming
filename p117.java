// Batch Updation means executing multiple sql statements together in one go instead of sending them one-ny-one to the database.
// Method: 
// 1. addBatch()
// 2. executeBatch()
import java.sql.*;
public class p117 
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
            stmt=conn.createStatement();
            // stmt.addBatch("insert into student1 values(2,'dev')");
            // stmt.addBatch("update student1 set name='Garg' where id=2");
            // stmt.addBatch("insert into student1 values(3,'Dev')");
            // stmt.executeBatch();
            // if we use int[] result=stmt.executeBatch(); 
            // then it will create an array name result which stores that 1 row affected and 0 row affected in the array
            System.out.println(conn.getAutoCommit()); // It is used to check the autocommit 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}