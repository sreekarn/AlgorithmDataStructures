package Arrays;

import java.util.Arrays;

public class RotateArray {
	
	public static int[] rotate(int[] nums,int k) {
		k=k%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums, 0, k - 1);
		reverse(nums,k,nums.length-1);
		System.out.println(Arrays.toString(nums));
		return null;
		
	}
	
	public static void reverse(int[] nums,int start,int end) {
	while(start<end){
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
		start++;
		end--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(Arrays.toString(rotate(nums, 3)));

	}

}
