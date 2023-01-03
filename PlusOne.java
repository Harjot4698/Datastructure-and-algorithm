package v0;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] increment(int[] digits) {
		int n=digits.length;
		int[] result=Arrays.copyOf(digits, n);
		
		result[n-1]++;
		for(int i=n-1;i>0 && result[i]==10;i--) {
			result[i]=0;
			result[i-1]++;
			
		}
		if(result[0]==0) {
			result[0]=0;
			int[] newResult=new int[n+1];
			newResult[0]=1;
			for(int i=1;i<n+1;i++) {
				newResult[i]=result[i+1];
				
			}
			return newResult;
		}
		return result;
 	}

	public static void main(String[] args) {
		
	int[] digits= {1,2,9};
	int[] results=increment(digits);
	System.out.println(Arrays.toString(results));

	}

}
