//Write a program to create a HashMap that stores the names of students and their grades,then print all entries.
//Write a program to check if a specific key exists in a HashMap.
//Create a program that merges two HashMaps into one.
//Write a program to remove an entry from a HashMap based on a specific key


import java.util.*;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;


 public class Hashmap {
    public static void main (String[] args) {
      
      	HashMap<String,String> hm1 = new HashMap<>();
      
      //Adding pairs
      	hm1.put("Ashish","A");
      	hm1.put("Abhishek","B");
      	hm1.put("Ram","A");
      	hm1.put("Shyam","D");
      	
      	
      	HashMap<String,String> hm2 = new HashMap<>();
      	
      	hm2.put("Ashish","E");
      	hm2.put("BBBBBB","E");
      	
        
        //iterate and print all entries
       for (Map.Entry<String, String> ent : hm1.entrySet()) {
            System.out.println("name  : "+ent.getKey() + " -> " + "Grade : "+ ent.getValue());
        }
         
         //to check if a specific key exists
         System.out.println(hm1.containsKey("Ram")); //true
         
         //merging 2 hashmaps into 1
         hm1.putAll(hm2);
         System.out.println (hm1); //O/P : {BBBBBB=E, Shyam=D, Ashish=E, Abhishek=B, Ram=A}
         
         
         //to remove an entry from a HashMap based on a specific key
         hm1.remove("Ashish");
           System.out.println (hm1);
    }
 }
 
    
