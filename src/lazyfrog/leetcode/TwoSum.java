package lazyfrog.leetcode;

import java.util.Arrays;

public class TwoSum {

	public int[] SumOfTwo(int[] nums, int target){
		//int[] res = new int[2];
		
		for(int i=0; i< nums.length; i++){
			for(int j = i + 1; j<nums.length; j++){
				if(nums[j] == target - nums[i]){
					return new int[]{i, j };
				}
			}
		}
		throw new IllegalArgumentException("not found");
		//System.out.println(Arrays.toString(res));
		//return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		TwoSum obj = new TwoSum();
		int[] res = obj.SumOfTwo(nums, 18);
		System.out.println(Arrays.toString(res));
	}

}
