//  Connection Modes
// Types of Commit:
// 1. Auto-Commit Mode(Default)
    // By default is always on
// 2. Manual Commit Mode(Transaction Management)
    // You control when to commit or rollback changes.
    // Multiple queries from one transaction
    // commit() is used to permanently save changes to the database.
    // rollback() is used to undo all changes made in the transaction
import java.sql.*;
public class p119 
{
    static final String JDBC_driver="com.mysql.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost:3306/devansh";
    static final String usr="root";
    static final String pass="devansh4506";
    public static void main(String[] args) 
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection(db_url,usr, pass);
            System.out.println("Connected to MySQL!");
            conn.setAutoCommit(false); // now code does not commit automatically, we have to commit manually
            stmt=conn.createStatement();
            stmt.executeUpdate("insert into student1 values(4,'ansh')");
            conn.commit(); // now we manually commit this code to save the changes in the database

            // if we now use conn.rollback(), then it will not undo the above query as the above query is already commited, therefore it will not undo
            // conn.rollback() is mainly used in the catch block as : 
        }
        catch(SQLException e)
        {
            try
            {
                conn.rollback();
            }
            catch(SQLException e1)
            {
                System.out.println(e1);
            }
        }
    }
}