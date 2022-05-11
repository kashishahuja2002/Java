import java.sql.*;  

class Select
{  
    public static void main(String args[])
    {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mtech","root","root");
    
            PreparedStatement stmt=con.prepareStatement("select * from emp");  
	    ResultSet rs=stmt.executeQuery();  
	    while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2));  
	    }     
            
            con.close();  
        }
        catch(Exception e) {  
            System.out.println(e);
        }  
    }  
}  