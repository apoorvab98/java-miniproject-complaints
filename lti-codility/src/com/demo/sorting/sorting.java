
package com.demo.sorting;
/* selection sort*/
public class sorting {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int A[]= {5,2,8,14,1,16};
		int [] B=new int [A.length];
		
		int k=0;
		int n=A.length;
		int minimal=0;
		for(k=0;k<n-1;k++) {
			minimal=k;
			for (int j=k+1;j<n;j++) {
				if (A[j]<A[minimal]) {
					minimal=j;
				}

				A[minimal]=A[k];
				A[k]=A[minimal];
			}
			
		}
		
		for (int p=0;p<A.length;p++) {
			System.out.println(A[p]);
		}
		//return A;
	}
}		
		
/*Output:
 5
5
8
14
14
16
 */

