package com.demo.loops;

import java.util.HashSet;

public class oddoccurrences {
	public int solution(int[] A) {
		HashSet<Integer>k=new HashSet<Integer>();
		int y=0;
		for(int i=0;i<A.length;i++) {
		if(k.contains(A[i])){
			k.remove(A[i]);
		}
		else {
			k.add(A[i]);
		}
	}
		for(Integer s:k) {
			//System.out.println(s);
			y=s.intValue();
		}
		return y;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,1,2,1,3,7,3};
		int a=new oddoccurrences().solution(A);
		System.out.println("number left: "+a);

	}

}
