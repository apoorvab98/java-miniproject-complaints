package com.demo.prefixsum;

public class countdiv {
	public static int solution(int A, int B, int K) {
//		int d;
		int count=0;
//		while(A<=B) {-----------correctness100%
//		for(int i=A;i<=B;i++) {
//			if(i%K==0) {
//				count++;
//			}
//		}
//		}
//		return count;
		int i=A;
		while(i<=B) {
				if(i%K==0) {
					count++;
					count+=(B-i)/K;
					break;
				}
				else {
					i++;
			}
			}
			return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=6;
		int B=11;
		int K=2;
		System.out.println(solution(A,B,K));

	}

}
