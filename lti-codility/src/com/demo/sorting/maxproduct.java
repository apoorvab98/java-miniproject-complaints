package com.demo.sorting;

import java.util.Arrays;

public class maxproduct {
	public static int solution(int[] A) {
		int s=0;
		Arrays.sort(A);
		int i=0;
		int p=0;
		int q=0;
		p=A[A.length-1]*A[A.length-2]*A[A.length-3];
		//for(i=0;i<A.length;i++) {
			if(A[0]<0) {
				i=0;
				q=A[0]*A[0+1]*A[A.length-1];
				p=Math.max(p, q);
			}
			return p;
			
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=new int [6];
		 A[0] = -3;
				  A[1] = 1;
				  A[2] = 2;
				  A[3] = -2;
				  A[4] = 5;
				  A[5] = 6;
	     System.out.println(solution(A));			  
	}

}
