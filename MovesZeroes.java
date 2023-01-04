package v0;

import java.util.Arrays;

public class MovesZeroes {
	public static void moveZeroes(int[] nums) {
		int right = 0,left=0;
		
		while(right<nums.length) {
			
			
			if(nums[right]!=0) {
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
	
			}
			right++;  // go to that element which
			         //is non zero and you that left pointer is already pointing to zero once you find the non replace it.
			}
				
			}
			




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 1, 0, 3, 12,3,4,5,0,34};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums)); 
	}

}
