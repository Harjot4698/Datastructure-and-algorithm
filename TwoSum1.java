package v0;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
	public static int[] twosum1(int[] arr,int target)
	{
		Map<Integer,Integer> mapnum=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int complements=target-arr[i];                    // given target 7 
			                                                 // for each element one by one check if there is pair that adds up to 9
			if(mapnum.containsKey(complements)){
				return new int [] {mapnum.get(complements),i};
				
			}
			mapnum.put(arr[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		
		
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=9;
		int[] indice =twosum1(arr,target);
		System.out.print(indice[0]+"    "+indice[1]);

	}

}
