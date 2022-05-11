import java.util.*;
import java.util.Map.Entry;  

class HashTableForEach {  
 public static void main(String args[]){  
  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
  
  ht.put(100,"Amit");  
  ht.put(102,"Ravi");  
  ht.put(101,"Vijay");  
  ht.put(103,"Rahul");  
  
  for(Entry entry: ht.entrySet()){  
   System.out.println(entry.getKey()+" "+entry.getValue());  
  }  
  
 }  
}  