package com.demo.prefixsum;

public class prefixsum {
	public static void main(String[] args) {
		int[] a= {10,4,16,20};
		int n=a.length;
		int i;
		int[] pref=new int[n];
		pref[0]=a[0];
		for(i=1;i<n;i++) {
			pref[i]=pref[i-1]+a[i];
			
		}
		for(i=0;i<n;i++) {
			System.out.println(pref[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println(pref[3]);
		
	}
}
