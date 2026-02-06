//Create a program that adds elements to an ArrayList and prints them in reverse order.


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

 public class Reverse {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<Integer> rev = new ArrayList<>();
      	
      	// Adding Element in ArrayList
      	rev.add(10);
      	rev.add(20);
      	rev.add(30);
      	
      	//using for loop
      	for (int i= rev.size()-1;i>=0;i--)
      	{
      	
      	System.out.println(rev.get(i) );
      	}
      	
      	//using collection utility class
      	Collections.reverse(rev);      
        System.out.println(rev);
        
    }
 }
