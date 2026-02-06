//Write a program to create a LinkedList of integers and add two numbers to it. 
//Create a program that prints all elements in a LinkedList. 
//Write a program to add an element to the beginning of a LinkedList.
//Create a program that removes the last element from a LinkedList.
//Write a program to check if a LinkedList is empty.


import java.util.*;
import java.util.LinkedList;

 public class ll {
    public static void main (String[] args) {        
      
      	LinkedList<Integer> ll = new LinkedList<>();
      	
      	// Adding Element in Linkedlist
      	ll.add(10);
      	ll.add(20);      	
      
      	//to add elements at particular index
      	ll.add (0,50);
      	
      	//to remove last element
      	ll.remove (2);
      	
      	System.out.println(ll);
      	
      	System.out.println(ll.isEmpty());

}}

