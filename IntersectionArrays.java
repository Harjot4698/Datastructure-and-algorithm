package v0;
import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArrays {
	public static ArrayList<Integer> intersectionArr(int[] a1,int[] a2) {
		HashSet<Integer>  hm=new HashSet<>();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int val:a1) {
			hm.add(val);
			
		}
		
		for(int val:a2) {
			if(hm.contains(val)) {
				arr.add(val);
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr1= {1,5,2,7,6,3,4};
		int[] arr2= {8,12,33,4,2,3};
		
		System.out.println(intersectionArr(arr1,arr2));

	}

}
