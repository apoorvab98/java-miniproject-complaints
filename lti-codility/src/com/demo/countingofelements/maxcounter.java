package com.demo.countingofelements;

public class maxcounter {
	public static int[] solution(int N, int[] A) {
		int[] B=new int [N];
		int k=0;
		int min=0;
		int max=0;
//		for (int i=0;i<N;i++) {
//			B[i]=0;
//		}
		
			for (int j=0;j<A.length;j++) {
//				k=A[j];
//				B[k]++;
//				if(A[j]==N+1) {
//					B[j]=
//				}
				if(A[j]>=1 && A[j]<=N) {
					if(B[ A[j]-1 ]<min) {
						B[A[j]-1]=min;
					}
					
				
				B[ A[j]-1 ]++;
				if(B[ A[j]-1 ]> max) {
					max=B[ A[j]-1 ];
					
				}
				}
				else if (A[j]==N+1) {
					min =max;
				}
			}
			for(int i=0;i<B.length;i++) {
				if(B[i]<min) {
					B[i]=min;
				}
			}
		
		return B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A=new int[7];
		A[0] = 3;
			    A[1] = 4;
			    A[2] = 4;
			    A[3] = 6;
			    A[4] = 1;
			    A[5] = 4;
			    A[6] = 4;

			    int[] B=solution(5,A);
			    for (int y:B) {
			    	System.out.println(y);
			    }

	}

}
