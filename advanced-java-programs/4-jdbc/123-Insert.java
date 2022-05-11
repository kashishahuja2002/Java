import java.sql.*;  

class Insert
{  
    public static void main(String args[])
    {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
    
            PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
            stmt.setInt(1,105);
            stmt.setString(2,"Min");  
            
            int i=stmt.executeUpdate();  
            System.out.println(i+" records inserted");  
            
            con.close();  
        }
        catch(Exception e) {  
            System.out.println(e);
        }  
    }  
}  