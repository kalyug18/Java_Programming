//Write a program to create a LinkedList of strings and print all elements.
//Create a program that adds elements to the beginning and end of a LinkedList.
//Write a program to remove the first and last elements from a LinkedList.
//Create a program that checks if a LinkedList contains a specific element.
//Write a program to reverse a LinkedList.


import java.util.*;
import java.util.LinkedList;
import java.util.Collections;


 public class ll {
    public static void main (String[] args) {
        
      
      	LinkedList<String> ll = new LinkedList<>();
      	
      	// Adding Element in Linkedlist
      
      	ll.add("Name is");
      	ll.add("Ashish");
      
      System.out.println(ll);
      
      	//to add elements
      	ll.addFirst("My");
      	ll.addLast("Ranjan");
      	System.out.println(ll);
      	
      	//to remove last element
      	ll.removeFirst();
      	ll.removeLast();
      	System.out.println(ll);
      	
      	//to check for a specific element
      	System.out.println(ll.contains("Ashish"));
      	
      	//to reverse using loop
      	for (int i = ll.size()-1;i>=0 ; i--)
      	{
      	    System.out.println (ll.get(i));
      	}
        
        //using collection utility class
        Collections.reverse(ll);
        System.out.println(ll);
        
    }
 }
 
    
