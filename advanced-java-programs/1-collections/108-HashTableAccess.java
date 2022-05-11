import java.util.*;  

class HashTableAccess
{  
  public static void main(String args[])
  {  
     Hashtable<Integer,String> ht=new Hashtable<Integer,String>();          
     ht.put(100,"Amit");    
     ht.put(102,"Ravi");   
     ht.put(101,"Vijay");    
     ht.put(103,"Rahul");    

     System.out.println(ht.get(101)); 
     //Here, we specify the if and else statement as arguments of the method   
     System.out.println(ht.getOrDefault(105, "Not Found"));  
 }  
}  