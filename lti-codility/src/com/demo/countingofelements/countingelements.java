package com.demo.countingofelements;

/*
 * count elements
 * def counting(A, m):
2 n = len(A)
3 count = [0] * (m + 1)
4 for k in xrange(n):
5 count[A[k]] += 1
6 return count
 */
public class countingelements {
	public static int[] counting(int[] A,int m) {
		int n=A.length;
		int count[]=new int[m];
		for(int k=0;k<n;k++) {
			count[A[k]]+=1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {0,0,4,2,4,5};
		int m=6;
		int h[]=counting(A,m);
		for (int j:h) {
			System.out.println(j);
		}
		

	}

}
/*output:
2
0
1
0
2
1
*/

