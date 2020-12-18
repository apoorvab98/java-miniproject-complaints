package com.demo.loops;

public class cyclicrotation {
	public  static int[] solution(int[] A, int K) {
		int n=A.length;
		int [] B=new int[n];
		int index = 0;
		for(int i=0;i<n;i++) {
			index=(i+K)%n;
			B[index]=A[i];
		}
		//System.out.println(index);
		return B;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4};
		int K=1;
		int []B;
		B=solution(A, K);
		System.out.println("new array:");
		for (int j=0;j<B.length;j++) {
			
			System.out.println(B[j]);
		}

	}

}
