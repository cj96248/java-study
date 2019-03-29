package com.training.algorithm.array;

public class Solution {
	
	public static void main(String[] args) {
		int[] nums = {12,34,34,55,67,67};
		print(nums);
		int[] plusOne = plusOne(nums);
		print(plusOne);
	}

	public static void removeDuplicates(int[] nums) {
		for(int i=0; i<nums.length-1;i++) {
			if(nums[i] == nums[i+1]) {
				System.arraycopy(nums, i, nums, i, nums.length-1);
				nums[i] = nums[i+1];
			}
		}
		print(nums);
	}
	public static int[] plusOne(int[] digits) {
		digits[digits.length-1]=digits[digits.length-1] +1 ;
		return digits;
	}
	
	public static void print(int[] nums) {
		for(int i: nums) {
			System.out.print(i+" ");
		}
		System.out.println("-----------");
	}
}
