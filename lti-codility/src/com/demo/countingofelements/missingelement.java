package com.demo.countingofelements;

import java.util.HashSet;

public class missingelement {
	public static int solution(int[] A) {
//		int x=0;
//		int g=A.length+1;
//		HashSet<Integer>h=new HashSet<Integer>();
//		for(int i=0;i<A.length;i++) {
//			h.add(A[i]);
//		}
//		for(int i=1;i<=A.length;i++) {
//			if(h.contains(i)!=true) {
//				x=i;
//			}
//			else {
//				x=g;
//			}
//		}
//		return x;
		int x=0;
		int g=A.length+1;
		int i;
		if(A.length==0){//if length is 0
		    return 1;
		}
		HashSet<Integer>h=new HashSet<Integer>();
		for(i=0;i<A.length;i++) {
			h.add(A[i]);
		}
		for(i=1;i<=A.length;i++) {
			if(h.contains(i)!=true) {//all values present
				return i;
			}
// 			else{
// 				x=g;
// 			}
		}
		return g;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] A = {1, 3, 6, 4, 1, 2};
		 //int []A= {1, 2, 3};
		 //int [] A= {-1,-3};
		 System.out.println(solution(A));
	}

}
