package com.demo.complexity;

public class tapeequilibrium {
	 public static int solution(int[] A) {
		 int s=0;
		 int t=0;
		 int mind=Integer.MAX_VALUE;
		 int[] g=new int[A.length];
		 g[0]=A[0];
		 int i;
		for(i=0;i<A.length;i++) {
			t+=A[i];
		}
		for(int p=1;p<A.length-1;p++) {
			g[p]=g[p-1]+A[p];
		}
		for(i=0;i<A.length-1;i++) {
			//t+=A[i];
			s=Math.abs(g[i]-(t-g[i]));
			if(mind>s) {
				mind=s;
			}
			
		}
		
		return mind;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=new int[5];
		 A[0] = 3;
				  A[1] = 1;
				  A[2] = 2;
				  A[3] = 4;
				  A[4] = 3;
				 System.out.println(solution(A));

	}

}
