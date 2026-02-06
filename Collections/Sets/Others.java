//Write a program to create a Set of strings and add one element.
//Create a program that checks if a Set is empty.
//Create a program that removes an element from a Set.
//Write a program to check the size of a Set.


import java.util.*;
import java.util.Collections;

 public class Seta {
    public static void main (String[] args) {
      
      	Set<String> hs1 = new LinkedHashSet<>();
      	
      	hs1.add ("AAA");
      	hs1.add ("BBB");
      	hs1.add ("CCC");
      	
      	System.out.println(hs1);            //[AAA, CCC, BBB]
      	
      	//checks if a Set is empty.
      		System.out.println(hs1.isEmpty());
      		
      		//to check the size os set
      		System.out.println(hs1.size());
      		
      	//	removes an element from a Set
      	
      	hs1.remove("BBB");
      	System.out.println(hs1);
     
    }}
