import java.util.*;  

class HashTableGenerics {  
 public static void main(String args[]){  
  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
  
  ht.put(100,"Amit");  
  ht.put(102,"Ravi");  
  ht.put(101,"Vijay");  
  ht.put(103,"Rahul");  
  
  System.out.println("HashTable: "+ht);  
  
 }  
}  