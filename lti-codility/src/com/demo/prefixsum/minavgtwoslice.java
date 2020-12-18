package com.demo.prefixsum;

public class minavgtwoslice {
	public static int solution(int[] A) {
		int g=0;
		float min=Integer.MAX_VALUE;
		int minstart=0;
		for(int i=0;i<A.length-2;i++) {
			float avg2=(float)(A[i]+A[i+1])/2;
			float avg3=(float)(A[i]+A[i+1]+A[i+2])/3;
			float curminavg=Math.min(avg2, avg3);
			if(curminavg<min) {
				min=curminavg;
				minstart=i;//0
			}
		}
		int avg2=(A[A.length-2]+A[A.length-1])/2;
		if(avg2<min) {
			min=avg2;
			minstart=A.length-2;
		}
		return minstart;
//		for (int i=0;i<A.length;i++) {
//			
//		}
		//return g;
	}
	public static void main(String[] args) {
		int [] A=new int [7];
		A[0] = 4;
			    A[1] = 2;
			    A[2] = 2;
			    A[3] = 5;
			    A[4] = 1;
			    A[5] = 5;
			    A[6] = 8;
			    System.out.println(solution(A));
	}
}
