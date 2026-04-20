// JDBC(Java Database Connectivity) is a standard Java API that allows Java programs to interact with databases.
// The JDBC API is a Java API that can access any kind of tabular data, especially data stored in a relational database.
// Java Application -> JDBC API -> JDBC Driver Manager -> JDBC Driver(whether it is mysql or Oracle or other databases)
// We have two types of architecture of JDBC:
// 1. 2-tier Architecture
    // Here Java application directly communicates with the database
    // Application -> Database
// 2. 3-tier Architecture
    // Here Java Application does not communicate directly with the database.
    // Application -> JDBC -> Database

// Currently we are using 3-tier Architecture

// JDBC Driver:
// It is a software component enabling a Java applicationto interact with a database.
// Tyes were: 
// 1. JDBC-ODBC bridge driver
    // Java Application ->  JDBC -> ODBC -> Database
// 2. Native-API driver(partially Java driver)
    // Java Application -> JDBC -> Native API -> Database
// 3. Network Protocol driver(fully Java driver)
    // Java Application -> JDBC -> Middleware -> Database
// 4. Thin driver(fully Java driver)
    // The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language.
    // Java Application -> JDBC -> Database
// Thin driver is best and it is currently used.

import java.sql.*;
public class p112
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
            conn.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception Caught");
        }
    }
}