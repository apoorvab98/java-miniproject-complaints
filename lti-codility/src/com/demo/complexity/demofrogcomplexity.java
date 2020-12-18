package com.demo.complexity;

public class demofrogcomplexity {
	public int solution(int X, int Y, int D) {
//		int count=1;	
//		int a=0;
//		int h=0;
//		h=X;
//		while(true) {
//			if(X<=Y) {
//		h=h+D;
//		//System.out.println(h);
//		if(h>Y) {
//			//System.out.println(count);
//			return count;
//			//break;
//			
//		}
//		else {
//		count++;
//		//System.out.println(count);
//		continue;}
//			}
////		}
		
		
//		return (int)Math.ceil((float)(Y-X)/(float)D);
		
		int noj=0;
		int diff=0;
		diff=Y-X;
		int a=0;
		if(diff%D!=0) {
			a=1;
		}
		noj=diff/D;
		noj=noj+a;
		return noj;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=new demofrogcomplexity().solution(10,85,30);
		System.out.println(g);

	}

}
