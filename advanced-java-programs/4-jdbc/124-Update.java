import java.sql.*;  

class Update
{  
    public static void main(String args[])
    {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
    
            PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
            stmt.setString(1,"Ahuja");
            stmt.setInt(2,101);  
            
            int i=stmt.executeUpdate();  
            System.out.println(i+" records updated"); 
            
            con.close();  
        }
        catch(Exception e) {  
            System.out.println(e);
        }  
    }  
}  