package com.demo.countingofelements;
/*
1 def slow_solution(A, B, m):
2 n = len(A)
3 sum_a = sum(A)
4 sum_b = sum(B)
5 for i in xrange(n):
6 for j in xrange(n):
7 change = B[j] - A[i]
8 sum_a += change
9 sum_b -= change
10 if sum_a == sum_b:
11 return True
12 sum_a -= change
13 sum_b += change
14 return False
 */
public class swapelements {
	public static int[] counting(int[] A,int m) {
		int n=A.length;
		int count[]=new int[m];
		for(int k=0;k<n;k++) {
			count[A[k]]+=1;
		}
		return count;
	}
	public static boolean slow_solution(int [] A,int[] B,int m) {
		int n=A.length;
		int sum_a = 0,sum_b = 0;
		int change=0;
		for(int i=0;i<n;i++) {
			sum_a+=A[i];
		}
		for(int i=0;i<n;i++) {
			sum_b+=B[i];
		}
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;i++) {
				change=B[j]-A[i];
		
		sum_a+=change;
		sum_b-=change;
		if (sum_a == sum_b) {
			return true;
		}
		else{
			sum_a -= change;
			sum_b += change;
		}
			}
		}
		return false;
			
	}
	/*
	 * 1 def fast_solution(A, B, m):
		2 n = len(A)
		3 sum_a = sum(A)
		4 sum_b = sum(B)
		5 d = sum_b - sum_a
		6 if d % 2 == 1:
		7 return False
		8 d //= 2
		9 count = counting(A, m)
		10 for i in xrange(n):
		11 if 0 <= B[i] - d and B[i] - d <= m and count[B[i] - d] > 0:
		12 return True
		13 return False
	 */
	public static boolean fast_solution(int [] A,int[] B,int m) {
		int n=A.length;
		int sum_a = 0,sum_b = 0;
		int change=0;int d=0;
		//int count=0;
		for(int i=0;i<n;i++) {
			sum_a+=A[i];
		}
		for(int i=0;i<n;i++) {
			sum_b+=B[i];
		}
		d=sum_b-sum_a;
		if(d%2==1) {
			return false;
		}
		else {
			d=(int) Math.floor(d/2);
			int [] count=new int[m];
			count=counting(A,m);
			for (int j=0;j<n;j++) {
				if((B[j]-d>=0) && (B[j]-d<=m) && (count[B[j]-d]>0)) {
					return true;
				}
			}
			return false;
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {0,0,4,2,4,5};
		int B[]= {0,0,4,1,1,1};
		int m=6;
		boolean f=slow_solution(A,B,m);
		System.out.println(f);
		boolean h=fast_solution(A,B,m);
		System.out.println(h);
		

	}

}
/*
 * output:
 * true
 * true
 */
