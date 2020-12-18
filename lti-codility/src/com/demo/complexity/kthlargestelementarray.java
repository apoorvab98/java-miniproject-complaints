package com.demo.complexity;

import java.util.Arrays;

public class kthlargestelementarray {
	 public static int findKthLargest(int[] nums, int k) {
	        Arrays.sort(nums);
	        return nums[nums.length-k];
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {8,5,1,1,3,6};
		System.out.println(findKthLargest(nums,2));
		
	}

}
