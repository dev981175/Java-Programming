// Types of Statement:
// 1. Statement (Already Done in p113)
    // Statement stmt=conn.createStatement();
// 2. Prepared Statement
    // Used for executing a precompiled SQL Statement
    // It uses placeholders(?) for parameters
    // Best for queries executed multiple times

import java.util.*;
import java.sql.*;
public class p114 
{
    static final String JDBC_driver="com.mysql.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost:3306/devansh";
    static final String usr="root";
    static final String pass="devansh4506";
    public static void main(String[] args) 
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection(db_url,usr, pass);
            System.out.println("Connected to MySQL!");
           

            // Prepared Statement
            // Inserting Value
            String query="insert into student1 values(?,?)"; 
            PreparedStatement pst=conn.prepareStatement(query);
            pst.setInt(1, 6);
            pst.setString(2,"Garg");
            pst.executeUpdate();
            System.out.println("Data Inserted");

            // Updating the Value
            String query1="update student1 set name=? where id=?";
            PreparedStatement pst1=conn.prepareStatement(query1);
            pst1.setString(1, "sita");
            pst1.setInt(2, 2);
            pst1.executeUpdate();
            System.out.println("Data Changed");

            // Deleting the value
            String query2="delete from student1 where id=?;";
            PreparedStatement pst3=conn.prepareStatement(query2);
            pst3.setInt(1, 2);
            pst3.executeUpdate();
            System.out.println("Data Deleted");


            // Taking Input from the user
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter ID: ");
            int id=sc.nextInt();
            System.out.print("Enter Name: ");
            String name=sc.next();
            String query4="insert into student1 values(?,?)";
            PreparedStatement pst5 = conn.prepareStatement(query4);
            pst5.setInt(1, id);
            pst5.setString(2, name);
            pst5.executeUpdate();
            System.out.println("Data Inserted Successfully");


            // Display the Statement
            String query3="select * from student1";
            PreparedStatement pst4=conn.prepareStatement(query3);
            ResultSet res=pst4.executeQuery();
            while(res.next())
            {
                System.out.println(res.getInt(1)+" -> "+res.getString("name"));
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}