// Updateable ResultSet
// It allows ResultSet allows modification of database records directly through the ResultSet object without writing explicit SQL UPDATE/INSERT/DELETE queries. 
// It has 3 operations: 
// 1. Update Exisiting Row
// 2. Insert New Row
// 3. Delete Row

import java.sql.*;
public class p116 
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
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); // Creation of the Updateable ResultSet
            ResultSet res=stmt.executeQuery("select id,name from student1");
            // res.absolute(3);
            // res.updateString("name","dev");
            // res.updateRow(); // This methow is required to give that the resultset will update only rows. // This is the process of updation


            // Insertion Process
            // res.moveToInsertRow(); // This method is used to set the pointer position to the current row.
            // res.updateInt("id", 2);
            // res.updateString("name","deepanshu");
            // res.insertRow();


            // Deletion Process
            // res.absolute(2);
            // res.deleteRow(); 


            // Searching Process
            while(res.next())
            {
                int id=res.getInt("id");
                if(id==3)
                {
                    res.updateString("name","Garg");
                    res.updateRow();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}