package com.demo.stacksqueus;
/*
 * def grocery_store(A):
2 n = len(A)
3 size, result = 0, 0
4 for i in xrange(n):
5 if A[i] == 0:
6 size += 1
7 else:
8 size -= 1
9 result = max(result, -size)
10 return result
 */
public class queueexercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {0,1,5,0,6,8,9};
		
		int n=A.length;
		int size=0;
		int len=0;
		int result=0;
		for (int i=0;i<A.length;i++) {
			if(A[i]==0) {
				size+=1;
			}
			else {
				size-=1;
			}
			result=Math.max(result, -(size));
		}
		System.out.println(result);

	}

}
/*op:3*/