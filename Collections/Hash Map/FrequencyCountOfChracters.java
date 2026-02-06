//Create a program that counts the frequency of each character in a string using a HashMap.  


import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "pneumonoultramicroscopicsilicovolcanoconiosis";
        
        // Create a HashMap to store results
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        //  Iterate through the string character by character after converting the string into character
        for (char c : input.toCharArray()) 
        {
            // Ignore spaces
            if (c == ' ') continue;

            // Update the count: 
            // If char exists, get current value + 1. 
            // If not, use 0 as default + 1.
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // 3. Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}	
