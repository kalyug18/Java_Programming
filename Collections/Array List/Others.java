//Write a program to check if an ArrayList is empty and print a message accordingly
//Create a program that finds the index of a specific element in an ArrayList
//Write a program to clone an ArrayList and display the cloned list.


import java.util.*;
import java.util.ArrayList;


 public class Empty {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<Integer> rev = new ArrayList<>();
      	
      	// Adding Element in ArrayList
      	rev.add(10);
      	rev.add(20);
      	rev.add(30);
      	
      	//to check if array list is empty
      	System.out.println(rev.isEmpty());
      	
      	//to find the index of a specific element
      	System.out.println(rev.indexOf(30));
      	
      	//to clone
      	System.out.println(rev.clone());
      	
        
    }
 }
 
