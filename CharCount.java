package v0;

public class CharCount {

	public static void main(String[] args) {
		
		
		// Elegant way to count occurence of specific character in a string 
		
		
		String input="Today is my angels birthday";
		
		int count=0;
		for(char ch:input.toCharArray()) {  // char ch initializes ch variable of char type 
			                                // toCharArray called over input string to convert words into character 
			                                // This loop will until every char in a string visited
			if(ch=='a') {
				count++;
			}
		}
		System.out.println("Count occurence of 'a' in a string = "+count);

	}

}
