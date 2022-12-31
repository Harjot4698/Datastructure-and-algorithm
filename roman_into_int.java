package v0;


public class roman_into_int {
	
	
	int value(char r) {
		    if (r == 'I')
	            return 1;
	        if (r == 'V')
	            return 5;
	        if (r == 'X')
	            return 10;
	        if (r == 'L')
	            return 50;
	        if (r == 'C')
	            return 100;
	        if (r == 'D')
	            return 500;
	        if (r == 'M')
	            return 1000;
	        return -1;
	}
   int RomanToDecimal(String str) {
		int res=0; 
		
		for(int i=0;i<str.length();i++) {
			int l=value(str.charAt(i));
			
			if(i+1<str.length()) {
				int r=value(str.charAt(i+1));
			
			
			if(l>=r) {
				res=res+l;
			}
			else {
				res=res+r-l;
				i++;
				
			}}
			else {
				res=res+l;
			}
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MCMIV";
		roman_into_int ob=new roman_into_int();
		
		System.out.println(ob.RomanToDecimal(str));}}
