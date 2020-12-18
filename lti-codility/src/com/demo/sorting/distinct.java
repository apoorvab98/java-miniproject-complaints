package com.demo.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class distinct {
	public static int solution(int[] A) {
		Arrays.sort(A);
		HashSet<Integer>h=new HashSet<Integer>();
		for (int i=0;i<A.length;i++) {
			h.add(A[i]);
		}
		int x=h.size();
		//int a=0;
		return x;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=new int [6];
		A[0] = 2;    A[1] = 1;    A[2] = 1;
				 A[3] = 2;    A[4] = 3 ;   A[5] = 1;
				 System.out.println(solution(A));
	}

}
