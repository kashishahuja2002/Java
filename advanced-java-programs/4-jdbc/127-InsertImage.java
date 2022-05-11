import java.sql.*;   
import java.io.*;   

class InsertImage
{  
    public static void main(String args[])
    {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
    
            PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
	    ps.setString(1,"Kashish");  
  
	    FileInputStream fin=new FileInputStream("E:/Pic.jpeg");  
	    ps.setBinaryStream(2,fin,fin.available());  
	    int i=ps.executeUpdate();  
	    System.out.println("Image inseted...");   
            
            con.close();  
        }
        catch(Exception e) {  
            System.out.println(e);
        }  
    }  
}  