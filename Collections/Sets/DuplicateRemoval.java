//Create a program that removes duplicates from a List using a Set.


import java.util.*;
import java.util.Collections;


 public class Seta {
    public static void main (String[] args) {
      
      	ArrayList<String> hs1 = new ArrayList<>();
      	
      	hs1.add ("AAA");
      	hs1.add ("BBB");
      	hs1.add ("CCC");
      	hs1.add ("AAA");
      	hs1.add ("CCC");
      	
      	System.out.println(hs1);            //[AAA, CCC, BBB]
      	
        
        Set<String> hs2 = new LinkedHashSet<>(hs1);
        Set<String> hs2 = new HashSet<>(hs1);
        
        hs1.clear();
        hs1.addAll(hs2);
     	System.out.println(hs1); // [AAA, BBB, CCC, AAA, CCC, AAA, CCC, BBB] --without clear
     	
     	//[AAA, BBB, CCC] --with LinkedHashSet
        //[AAA, CCC, BBB]-- with HashSet
     
    }}
      	
      	
