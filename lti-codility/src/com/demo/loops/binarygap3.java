package com.demo.loops;
import java.util.Scanner;

	public class binarygap3 {

		public static int solution(int n) {
			// TODO Auto-generated method stub
			int x;
			int g=0;
			int count=0;
			if(n==1){
			    return 0;
			}
			char bin[]=Integer.toBinaryString(n).toCharArray();
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
				
	        return g;
	        
			
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("Enter the char y or n:");	
			char c=sc.next().charAt(0);
			if(c=='y'){
				System.out.println("Enter the number::");
				int n=sc.nextInt();
				System.out.println("Longest binary gap:"+solution(n));
				continue;
			}
			else {
				System.out.println("Stopped");
				break;
				
			}
			
		}
	}
	

		

}
