package com.demo.complexity;

import java.util.HashSet;

public class findmissingelement {
	 public static int solution(int[] A) {
//		 HashSet<Integer>k=new HashSet<>();
//		 int a=0;
//		 int a1 = 0;
//		 for(int i=0;i<A.length+2;i++) {
//			 if(k.contains(A[i])){
//					k.remove(A[i]);
//				}
//			 
//			 else {
//			 k.add(A[i]);
//			 
//		 }
//		 }
//		 
//		for(Integer h:k) {
//			a1=h.intValue();
//			
//		}
//		return a1;
		 long size=A.length;
		 if(size==0) {
			 return 1;
		 }
		 long sum=0;
		 for(int val:A) {
			 sum+=val;
		 }
		 long actsum=((size+1)*(size+2)/2);//sum of natural nos.
		 return (int)(actsum-sum);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,3,1,5};
		System.out.println(solution(A));
		//System.out.println("number left: "+a);

	}

}
