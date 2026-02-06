//Write a program to create an ArrayList of integers and find the average of the elements.

import java.util.*;
import java.util.ArrayList;

 public class Average {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<Integer> avg = new ArrayList<>();
      	
      	// Adding Element in ArrayList
      	avg.add(10);
      	avg.add(20);
      	avg.add(10);
      	
      	long sum=0;
      	for (int s : avg)
      	{
      	    sum =sum +s;
      	}
      	
      	double average = sum /avg.size();
      	System.out.println("Average :" + average);
        
    }
 }
    
