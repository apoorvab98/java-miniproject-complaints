package com.demo.loops;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
	public class binarygapsession3 {
		public static void main(String[] args) {
	        HashMap<Integer,Integer>hp=new HashMap<>();
			Scanner sc=new Scanner(System.in);
			char c='y';
			while(c=='y') {		
			int x;
			int g=0;
			int count=0;
	 		int n;
	 		System.out.println("Enter the number::");
	 		n=sc.nextInt();
			if(n==1){
			    g=0;
			}
			char bin[]=Integer.toBinaryString(n).toCharArray();
			String p=Integer.toBinaryString(n);
	        for(int i=0;i<bin.length;i++){
				if(bin[i]=='0') {
					count++;
					continue;
				}
				else {
					if(count>g) {
						g=count;
					}
					count=0;
				}
				
			}
	        hp.put(n, g);
				System.out.println("Longest binary gap: "+g);
				System.out.println("Want to continue?(y/n)");
				c=sc.next().charAt(0);		
				
			}		
			System.out.println("Enter the binary gap:");
			int h=sc.nextInt();
			for(Entry<Integer,Integer> e:hp.entrySet()) {
				if(e.getValue()==h) {
					System.out.println("Stored numbers are:"+e.getKey());
				}
			}
			
		
	}
	}
