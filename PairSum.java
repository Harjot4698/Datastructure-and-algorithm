package v0;
import java.util.*;

public class PairSum {
	
	public static int getPairsCount(int arr[],int n,int sum)
	{   HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i]))
			{
				hm.put(arr[i], 0);
			}
			hm.put(arr[i], hm.get(arr[i])+1);
			
		}
		int twice_count=0;
		for(int i=0;i<n;i++) {
			if(hm.get(sum-arr[i])!=null)
			{
				twice_count+=hm.get(sum-arr[i]);
			}
			if(sum-arr[i]==arr[i]) {
				twice_count--;
			}
		}
		
		return twice_count/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,5,7,-1};
		int sum=6;
		System.out.println(getPairsCount(a,4,sum));

	}

}
