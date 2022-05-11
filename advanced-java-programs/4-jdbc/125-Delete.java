import java.sql.*;  

class Delete
{  
    public static void main(String args[])
    {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
    
            PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");  
	    stmt.setInt(1,101);  
  
            int i=stmt.executeUpdate();  
	    System.out.println(i+" records deleted");   
            
            con.close();  
        }
        catch(Exception e) {  
            System.out.println(e);
        }  
    }  
}  