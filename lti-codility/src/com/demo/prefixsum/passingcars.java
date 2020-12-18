package com.demo.prefixsum;

import java.util.ArrayList;

public class passingcars {
	public static int solution(int[] A) {
		int h=0;
		int east=0;
		int pasc=0;
		ArrayList<Integer>a=new ArrayList<>();
		for (int i=0;i<A.length;i++) {
			a.add(A[i]);
		}
		for (int i=0;i<A.length;i++) {
			if (pasc > 1000000000)
            {
                return -1;
            }
			if(a.get(i)==0) {
				east++;
			}
			else {
				pasc+=east;
			}
			
		}
		return pasc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int [5];
		 A[0] = 0;
				  A[1] = 1;
				  A[2] = 0;
				  A[3] = 1;
				  A[4] = 1;
				 System.out.println(solution(A)); 

	}

}
