package com.demo.loops;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fa=1;
		int n=5;//factorial of 5
		for (int i=1;i<n+1;i++) {
			fa=fa*i;
		}
		System.out.println("Factorial of 5:"+fa);
		

	}

}
/*
 * Dry Run
 *  i<=5 fa=fac*i
 *1 1<=5 1*1=1//fa=1
 *2 2<=5 1*2=2
 *3 3<=5 2*3=6
 *4 4<=5 6*4=24
 *5 5<=5 24*5=120
 *6 6<=5----false
 * 
 * */
