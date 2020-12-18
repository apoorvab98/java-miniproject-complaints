package com.demo.loops;
/*
1 
12 
123 
1234 
12345 

 */
public class starpattern2 {
	public static void main(String[] args) {
 int n=5;
 for(int i=1;i<=5;i++) {
	 for (int j=1;j<=i;j++) {
		 System.out.print(j);
	 }
	 System.out.println(" ");
 }
 
}
}
/*
 * dry run
 * i i<=5 j j<=i output
 * 1 1<=5 1 1<=1 1
 *        2 2<=1---false
 *              
 * 2 2<=5 1 1<=2 1
 * 2 2<=5 2 2<=2 1 2  
 * 2 2<=5 3 3<=2---false
 *          
 * 3 3<=5 1 1<=3 1
 *       2 2<=3 1 2 
 *       3 3<=3 1 2 3
 *       4 4<=3---false
 *     
 * 4 4<=5 1 1<=4 1
 *        2 2<=4 1 2
 *        3 3<=4 1 2 3
 *        4 4<=4 1 2 3 4
 *        5 5<=4---false
 *   
 * 5 5<=5 1 1<=5 1
 *        2 2<=5 1 2
 *        3 3<=5 1 2 3
 *        4 4<=5 1 2 3 4
 *        5 5<=5 1 2 3 4 5
 *        6 6<=5---false      
  
 * */
