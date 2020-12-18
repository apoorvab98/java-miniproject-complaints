package com.demo.loops;

public class cyclicrotation_demo {
	public  static int[] solution(int[] A, int K) {
		int n=A.length;
		int [] B=new int[n];
		int index = 0;
		if(A.length==0) {
			return A;
		}
		
		for (int i = 0; i < K; i++) {
			int last=A[n-1];
		for (int j = n - 1; j > 0; j--) 
	        A[j] = A[j-1];
	 
	    A[0] = last;
		}
		return A;
	}
		
	
	 
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] A= {1,2,3,4};
			int K=2;
			int []B;
			B=solution(A, K);
			System.out.println("new array:");
			for (int j=0;j<B.length;j++) {
				
				System.out.println(B[j]);
			}

		}
	
}
