package v0;
import java.util.ArrayList;
public class DuplicateNumber {
	public static ArrayList<Integer> findDuplicates(int[] nums){
		ArrayList<Integer> output_arr=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int index=Math.abs(nums[i])-1;
			if(nums[index]<0) {
				output_arr.add(index+1);
			}
			nums[index]=-nums[index];
		}
		return output_arr;
		
	}
	
	public static void main(String[] args) {
		int[] list= {1,3,4,4,2,2,7,8,8};
		
		System.out.println(findDuplicates(list));
		
	}

}
