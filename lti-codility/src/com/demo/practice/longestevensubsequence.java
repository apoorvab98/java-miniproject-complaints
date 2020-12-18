package com.demo.practice;
/*
 * Given a array of n positive and negative integers, find the subsequence with the maximum even sum and display that even sum.

Examples:

Input: arr[] = {-2, 2, -3, 1, 3}
Output: 6
Explanation: The longest subsequence
with even sum is 2, 1 and 3.

Input: arr[] = {-2, 2, -3, 4, 5}
Output: 6
Explanation: The longest subsequence
with even sum is 2, 1 and 3.
 */
public class longestevensubsequence {
	public static void main(String[] args) {
		int[] arr = {-2, 2, -3, 1, 3};
		int pos=0;
		int p=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pos+=arr[i];
			}
		}
		if(pos%2==0) {
			p=pos;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				if(arr[i]>0) {
					pos+=arr[i];
				}
			}
		}
	}
}
