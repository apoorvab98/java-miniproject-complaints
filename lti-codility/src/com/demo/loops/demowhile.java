package com.demo.loops;

import java.util.Scanner;

public class demowhile {
	public static void main(String[] args) {
		int n,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n>0) {
			n/=10;
			res++;
		}
		System.out.println("No. of digits are :"+res);
		
	}
}
