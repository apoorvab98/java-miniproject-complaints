package com.demo.loops;
/*
 * * * * * * *
   * * * * *
     * * *
	   *
 */
/*
 *1 for i in range(n, 0, -1):
2 for j in range(n - i):
3 print ’ ’,
4 for j in range(2 * i - 1):
5 print ’*’,
6 print
 */
public class starpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=5;
		int j=0;
		for (int i=n;i>0;i--) {
			for(j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
