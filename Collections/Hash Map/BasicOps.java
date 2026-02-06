//Write a program to create a HashMap and add one key-value pair.
//Create a program that retrieves a value from a HashMap using a key.
//Write a program to check if a specific key exists in a HashMap.
//Create a program that prints all keys in a HashMap.
//Write a program to remove a key-value pair from a HashMap.


import java.util.*;
import java.util.LinkedList;
import java.util.Collections;


 public class Hashmap {
    public static void main (String[] args) {
        
      
      	HashMap<Integer,String> hm = new HashMap<>();
      	
      //Adding pairs
      	hm.put(15,"Ashish");
      	hm.put(18,"Abhishek");
      	hm.put(20,"Ram");
      	hm.put(19,"Shyam");
        
         System.out.println(hm);
         
         //retrieves a value from a HashMap using a key
         System.out.println(hm.get(20));
         
         //to check if a specific key exists in a HashMap
          System.out.println(hm.containsKey(20));
        
        //prints all keys
          System.out.println( hm.keySet());
         
         //remove a K,V pair
         hm.remove(15);
         System.out.println(hm);
         
    }
 }
     
