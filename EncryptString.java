package v0;
import java.util.Scanner;

public class EncryptString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the input string
    System.out.print("Enter the string to be encrypted: ");
    String input = scanner.nextLine();

    // Encrypt the string
    String encrypted = encryptString(input);

    // Print the encrypted string
    System.out.println("Encrypted string: " + encrypted);
  }
  public static String encryptString(String input) {
	    StringBuilder result = new StringBuilder();
	    int count = 1;
	    char current = input.charAt(0);
			
	    for (int i = 1; i < input.length(); i++) {
	        if (input.charAt(i) == current) {
	          count++;
				}else {
	            result.append(current).append(Integer.toHexString(count));
	            current = input.charAt(i);
	            count = 1;
	          }}
	            
	    result.append(current).append(Integer.toHexString(count));
			
			return result.reverse().toString(); // tostring because stringbuidler return object not string , so we need convert it ourselves.
			
		}
		
		
		

	

}
