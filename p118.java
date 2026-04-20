// Batch Updation using prepared Statement
import java.sql.*;
public class p118 
{
    static final String JDBC_driver="com.mysql.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost:3306/devansh";
    static final String usr="root";
    static final String pass="devansh4506";
    public static void main(String[] args)
    {
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection(db_url,usr, pass);
            System.out.println("Connected to MySQL!");
            // PreparedStatement ps=conn.prepareStatement("insert into student1 values(?,?)");
            // ps.setInt(1, 1);
            // ps.setString(2, "A");
            // ps.addBatch();
        }
    }
}