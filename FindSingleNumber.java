package v0;

public class FindSingleNumber {
	
	public static int singleNumber(int[] a) {
		int result=0;
		for(int i=0;i<a.length;i++) {
			result ^=a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		
		int [] arr= {1,1,2,2,3,3,4,4,5,5,6};
		// TODO Auto-generated method stub
        System.out.print(singleNumber(arr));
	}

}
