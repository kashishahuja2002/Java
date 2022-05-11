import java.sql.*;

public class CreateTable
{
    public static void main(String... args) throws Exception
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
	    String q = "create table emp(id INTEGER(10),name VARCHAR(50))";  
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created..."); 
	    con.close();           
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
