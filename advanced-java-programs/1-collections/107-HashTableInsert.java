import java.util.*;  

class HashTableInsert
{  
 public static void main(String args[])
 {  
    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();          
     ht.put(100,"Amit");    
     ht.put(102,"Ravi");   
     ht.put(101,"Vijay");    
     ht.put(103,"Rahul");    
     System.out.println("Initial Table: "+ht);
  
     //Inserts, as the specified pair is unique  
     ht.putIfAbsent(104,"Gaurav");  
     System.out.println("Updated Table: "+ht); 
 
     //Returns the current value, as the specified pair already exist  
     ht.putIfAbsent(101,"Vijay");  
     System.out.println("Updated Table: "+ht);  
 }  
}  