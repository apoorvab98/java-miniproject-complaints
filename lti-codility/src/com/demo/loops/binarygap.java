
package com.demo.loops;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class binarygap {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n;
//		int g=0;
//		int count=0;
//		int c=0;
//		String y=" ";
//		int a;
//		int max=0;
//		boolean flag=false;
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
//		while(true) {
//		String p=Integer.toBinaryString(n);
//		ArrayList<Integer>fg=new ArrayList<Integer>();
//		ArrayList<Integer>ar=new ArrayList<Integer>();
////		for(int i=0;i<p.length();i++) {
////		if(p.charAt(i)=='0') {
////			count++;
////			
////		}
////		else {
////			fg.add(count);
////			count=0;
////		}
////		}
////		System.out.println("Binary:"+p);
////		System.out.println(Collections.max(fg));
//		while(n>0) {
//			a=n%2;
//			if(a==0) {
//				count++;
//			}
//			else if(a==1) {
//				//count++;
//				ar.add(count);
//				if(g>count) {
//					count=g;
//				}
//				count=0;
//			}
//			
//			y=a+" "+y;
//			n/=2;
//			
//		}
//		System.out.println("Binary number :"+y);
//		System.out.println("Max binary gap "+Collections.max(ar));
//		System.out.println("Count of 0:"+count);
//	}
//
//}
//}

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class binarygap {

	public static int solution(int n) {
		// TODO Auto-generated method stub
		int x;
		//int n;
		int g=0;
		int count=0;
		if(n==1){
		    return 0;
		}
// 		int c=0;
// 		String y=" ";
// 		int a;
// 		int max=0;
// 		boolean flag=false;
// 		Scanner sc=new Scanner(System.in);
// 		n=sc.nextInt();
		char bin[]=Integer.toBinaryString(n).toCharArray();
		String p=Integer.toBinaryString(n);
		ArrayList<Integer>fg=new ArrayList<Integer>();
		ArrayList<Integer>ar=new ArrayList<Integer>();
// 		while(n>0) {
// 			a=n%2;
        for(int i=0;i<bin.length;i++){
			if(bin[i]=='0') {
				count++;
				continue;
			}
			else {
				//count++;
				//ar.add(count);
				if(count>g) {
					g=count;
				}
				count=0;
			}
			
// 			y=a+" "+y;
// 			n/=2;
			
		}
		//System.out.println("Binary number :"+y);
// 		x=Collections.max(ar);
// 		return x;
        return g;
        
		//System.out.println("Count of 0:"+count);
		
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the char y or n:");	
		char c=sc.next().charAt(0);
		if(c=='y'){
			System.out.println("Enter the number::");
			int n=sc.nextInt();
			System.out.println(solution(n));
			continue;
		}
		else {
			break;
			
		}
		
	}
}
}

	
