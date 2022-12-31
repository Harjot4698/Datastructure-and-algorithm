package v0;

import java.util.Stack;



public class Reverse_word_in_a_string {
	
	
	
	public static String reverseWords(String s) {
		String[] words=s.split("\\s+");
		
		Stack<String> stack=new Stack<>();
		
		for(String word:words) {
			stack.push(word);
		}
		StringBuilder reverseString=new StringBuilder();
		
		 while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
			reverseString.append(" ");
		}
		return reverseString.toString().trim();
	}

	public static void main(String[] args) {
		
		String s="hello my name is harjot";
		System.out.println(reverseWords(s));
		

	}

}
