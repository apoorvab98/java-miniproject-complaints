package com.demo.countingofelements;

import java.util.HashSet;

public class frogjump {
	public static int solution(int X, int[] A) {
		int a=0;
		int d=-1;;
		HashSet<Integer>s=new HashSet<Integer>();
		for (int i=1;i<=X;i++) {				
				s.add(i);
		}
		
		for (int i=0;i<A.length;i++) {
			if(s.contains(A[i])==true) {			
				s.remove(A[i]);
			}
			if(s.isEmpty()==true) {
				d=i;
				break;
			}
			
		}
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[8];
		 A[0] = 1;
			  A[1] = 3;
			  A[2] = 1;
			  A[3] = 4;
			  A[4] = 2;
			  A[5] = 3;
			  A[6] = 5;
			  A[7] = 4;
			  System.out.println(solution(5,A));
			  

	}

}
