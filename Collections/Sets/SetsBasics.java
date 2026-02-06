//Write a program to create a Set of integers and add some elements to it.
//Create a program that checks if a Set contains a specific element.
//Write a program to find the union of two Sets.
//Write a program to iterate over a Set and print its elements


import java.util.*;
import java.util.Collections;


 public class Seta {
    public static void main (String[] args) {
      
      	Set<String> hs1 = new HashSet<>();
      	
      	//adding elements to set
      	hs1.add ("AAA");
      	hs1.add ("BBB");
      	hs1.add ("CCC");
      		hs1.add ("CCC");
      	
      	System.out.println(hs1);            //[AAA, CCC, BBB]
      	
        //checks if a Set contains a specific element
        System.out.println(hs1.contains("AAA"));       //true
     
        //to find the union of two Sets
      	Set<String> hs2 = new HashSet<>();
      	hs2.add ("BBB");
      	hs2.add ("EEE");
      	
        hs1.addAll(hs2);
        System.out.println(hs1);        // O/p: [AAA, CCC, BBB, EEE]
      	
      	// to iterate over a Set and print its elements
      	
      	for (String h: hs1)
      	{ 
      	    System.out.println(h); 
      	}
      	
    }}
