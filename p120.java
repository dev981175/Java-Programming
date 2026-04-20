// Savepoint
// It is a checkpoint inside a transaction that allows you to rollback to a specific point instead of the entire transaction. 
// It is used in manual commit mode( when autoCommit = false)

// It is require because:
// Normally: rollback() -> undo entire transaction
// But sometimes we need: Undo only a part of transaction.
// For example: we have checkpoints so that the progress is saved if we lost after that then we move to checkpoints instead of starting. Here checkpoints are Savepoints

// A savepoint is a point inside a transaction to which you can rollback partially.

import java.sql.*;
public class p120 
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
            conn.setAutoCommit(false);
            stmt=conn.createStatement();
            stmt.executeUpdate("insert into student1 values(5,'ga')");
            Savepoint sp=conn.setSavepoint("SP1");
            stmt.executeUpdate("insert into student1 values(6,'rg')");
            conn.rollback(sp); // With rollback second insert statement will not execute, only first insert statement is executed.
            conn.commit();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}