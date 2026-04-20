// BLOB(Binary Large Object) is used to store large binary (non-text) data in database
// Use BLOB when data is non-text(image)

// CLOB(Character Large Object) is used to store large text data.
// Use CLOB when data is text
import java.sql.*;
import java.io.*;
public class p121 
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
            // CREATE TABLE file (    id INTEGER,     name VARCHAR(20),    binarydata BLOB,    data TEXT); 
            // CLOB is recognised as TEXT in mysql


            // PreparedStatement pst=conn.prepareStatement("insert into file values(?,?,?,?)");
            // pst.setInt(1, 1);
            // pst.setString(2,"Devansh");

            // FileInputStream fis=new FileInputStream("img.jpeg");
            // pst.setBlob(3, fis); // For BLOB we always use FileInputStream Class as it will done in binary data

            // FileReader fr=new FileReader("p1.txt");
            // pst.setClob(4, fr); // For CLOB we always use FileReader Class as it will done in text data

            // pst.executeUpdate();


            // For Retrievel of BLOB AND CLOB
            // BLOB
            // PreparedStatement ps=conn.prepareStatement("select binarydata from file where id=1");
            // ResultSet res=ps.executeQuery();
            // if(res.next())
            // {
            //     Blob b=res.getBlob(1);
            //     byte[] data=b.getBytes(1,(int)b.length());
            //     FileOutputStream fos=new FileOutputStream("image1.png");
            //     fos.write(data);
            //     fos.close();
            // }

            // CLOB
            PreparedStatement ps=conn.prepareStatement("select data from file where id=1");
            ResultSet res=ps.executeQuery();
            if(res.next())
            {
                Clob b=res.getClob(1);
                Reader r=b.getCharacterStream();
                FileWriter fw=new FileWriter("p3.txt");
                int i;
                while((i=r.read())!=-1)
                {
                    fw.write(i);
                }
            }
            conn.close();
        }
        catch(Exception e)
        {
            try
            {
                conn.rollback();
            }
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}