//1.Write a program to create an ArrayList of strings and add three names to it.
//2.Create a program that prints all elements in an ArrayList
//3.Write a program to add an element to a specific index in an ArrayList.
//4.Create a program that removes an element from an ArrayList.
//5.Write a program to check the size of an ArrayList.


import java.util.ArrayList;

class Main {
    public static void main (String[] args) {
        
      	// Creating an ArrayList of strings
      	ArrayList<String> str = new ArrayList<>();
      	
      	// Adding Elements in ArrayList
      	str.add("Ash");
      	str.add("Ran");  
      
      	// Printing ArrayList
      	System.out.println(Old array list :"+ str);

	//adding an element to a specific index	
	str.add(2,"18");
	System.out.println(New array list :"+ str);

	//removing an element.
	str.remove(2);
	
	//check the size of arraylist
	System.out.println (str.size());
    }
}

