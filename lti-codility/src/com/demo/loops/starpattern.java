package com.demo.loops;
/*
*
* *
* * *
* * * *
 */
public class starpattern {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
/*
 * dry run
 * i i<=4 j j<=i output
 * 1 1<=4 1 1<=1 *
 *        2 2<=1---false
 *              
 * 2 2<=4 1 1<=2 *
 * 2 2<=4 2 2<=2 * *   
 * 2 2<=4 3 3<=2---false
 *          
 * 3 3<=4 1 1<=3 *
 *       2 2<=3 * * 
 *       3 3<=3 * * *
 *       4 4<=3---false
 *     
 * 4 4<=4 1 1<=4 *
 *        2 2<=4 * * 
 *        3 3<=4 * * * 
 *        4 4<=4 * * * * 
 *        5 5<=4---false
 *        
 *      
 *                    
 * 
 * */
