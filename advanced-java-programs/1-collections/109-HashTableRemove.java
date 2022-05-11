import java.util.*;  

class HashTableRemove 
{  
   public static void main(String args[]) 
   {  
     Hashtable<Integer,String> ht=new Hashtable<Integer,String>();        
     ht.put(100,"Amit");    
     ht.put(102,"Ravi");   
     ht.put(101,"Vijay");    
     ht.put(103,"Rahul");  
     System.out.println("Before remove: "+ ht); 
   
     // Remove value for key 102  
     ht.remove(102);  
     System.out.println("After remove: "+ ht);  
   }      
}  