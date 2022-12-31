package v0;
import java.util.*;
import java.util.Map.Entry;

public class First_Non_repeated_char {

	// Return the First Non-Repeated Char in a string
		
    public static char getFirstNonRepeatedChar(String str) {
    	Map <Character,Integer> counts=new LinkedHashMap<>(str.length());
    	
    	for(char c:str.toCharArray()) {
    		counts.put(c, counts.containsKey(c)?counts.get(c) + 1:1);  // Put character in a map 
    		                                                          //  check whether Key is already in the map and add it by updating the new count
    		                                                          //, if not then add them assign the count by setting it to 1 
    	}
    	
    	for(Entry<Character, Integer> entry:counts.entrySet()) {
    		if(entry.getValue()==1) {
    			return entry.getKey();
    		}
    	}
    	throw new RuntimeException("didnt find any non repeated Character");
    	
    }
	public static void main(String arg[]) {
		System.out.print(getFirstNonRepeatedChar("aabbccdee"));
	}

}
