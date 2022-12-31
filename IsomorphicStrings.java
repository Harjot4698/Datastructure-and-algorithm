package v0;

    import java.util.Scanner;
	import java.util.HashMap;

	public class IsomorphicStrings {
	    public static boolean areIsomorphic(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        HashMap<Character, Character> map = new HashMap<>();

	        for (int i = 0; i < s1.length(); i++) {
	            char c1 = s1.charAt(i);
	            char c2 = s2.charAt(i);

	            if (map.containsKey(c1)) {
	                if (map.get(c1) != c2) {
	                    return false;
	                }
	            } else {
	                map.put(c1, c2);
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String s1 = "foo";
	        String s2 = "app";
	        System.out.println(areIsomorphic(s1, s2)); // prints true

	        s1 = "brrllz";
	        s2 = "foojjk";
	        System.out.println(areIsomorphic(s1, s2)); // prints false
	    }
	}



