// Statement: It is used for executing a simple SQL statement without any parameters.
    // Statement stmt=con.create

// Steps for JDBC Connectivity:
// 1. Import packages
// 2. Load Driver
// 3. Establish connection
// 4. Create Statement
// 5. Execute query
import java.util.*;
import java.sql.*;
public class p113 
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
            String query="create table student1(id integer primary key, name varchar(20));";
            stmt.executeUpdate(query);
            System.out.println("table created");


            String query2="insert into student1 values(1,'Devansh');";
            stmt.executeUpdate(query2);
            System.out.println("inserted data");
            String query3="insert into student1 values(2,'Deepanshu');";
            stmt.executeUpdate(query3);
            String query4="insert into student1 values(3,'Dhruv');";
            stmt.executeUpdate(query4);


            String query5="update student1 set name='Dhruv Mittal' where id=3;";
            stmt.executeUpdate(query5);


            String query6="delete from student1 where id=2;";
            int n=stmt.executeUpdate(query6);
            System.out.println(n+" rows affected");

            Scanner sc=new Scanner(System.in);
            System.out.print("enter name for id=3: ");
            String nm=sc.nextLine();
            String query7="update student1 set name='" + nm+ "' where id=3;";
            stmt.executeUpdate(query7);


            System.out.println("Data in the Table: ");
            String sql_stmt = "select * from student1";
            ResultSet res = stmt.executeQuery(sql_stmt); // Execute Query will only work with select clause
            while(res.next())
            {
                // Get by column name
                int id = res.getInt("id");
                // We can also write 
                // int id = res.getInt(1); // Here 1 is the column number
                String name = res.getString("name");
                // We can also write 
                // String name = res.getString(2); // Here 2 is the column number
                // Show values
                System.out.println(id+" : "+name);
            }
            res.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught"+e);
        }
    }
}