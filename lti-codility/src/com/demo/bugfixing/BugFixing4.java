package com.demo.bugfixing;

public class BugFixing4 {
	//A - array of 0s and 1s
			//need to return the starting position of first sequence of the maximal occurrences of 1s
			//return -1 in case if the array does not contains 1s
			int solution(int[] A) {
				int n = A.length;    
				int i = n - 1;     
				int result = -1;
				int k = 0, maximal = 0;
				while (i > 0) {
					if (A[i] == 1) {
						k = k + 1;
						if (k >= maximal) {
							maximal = k;
							result = i;
						}
					} else
						k = 0;
					i = i - 1;
				}
				if (A[i] == 1 && k + 1 >= maximal) {   
					result = 0;
				}
					
				return result;
			}
			
			public static void main(String[] args) {
				//int[] A = {0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
				int[] A= {1,1,1,0,0,1,1,1,0,0};
				System.out.println(new BugFixing4().solution(A));
			}
}
/*
 * [10:43 AM] Simant Setu
    
public class BugFixing3 {​​​​​

 //check if the array contains every number from 1 to K atleast once
public boolean solution(int[] A, int K) {​​​​​
int n = A.length;
for (int i = 0; i < n - 1; i++) {​​​​​
if (A[i] + 1 < A[i + 1])
return false;
}​​​​​
if (A[0] != 1 && A[n - 1] != K)//change && to !!
return false;
else
return true;
}​​​​​
public static void main(String[] args) {​​​​​
int[] A = {​​​​​1, 1, 2, 2, 3}​​​​​;
int K = 3;
System.out.println(new BugFixing3().solution(A, K));
}​​​​​
}​​​​​
​[10:43 AM] Simant Setu
    
public class BugFixing4 {​​​​​

 //A - array of 0s and 1s
//need to return the starting position of first sequence of the maximal occurrences of 1s
//return -1 in case if the array does not contains 1s
int solution(int[] A) {​​​​​
int n = A.length;
int i = n - 1;
int result = -1;
int k = 0, maximal = 0;
while (i > 0) {​​​​​
if (A[i] == 1) {​​​​​
k = k + 1;
if (k >= maximal) {​​​​​
maximal = k;
result = i;
}​​​​​
}​​​​​ else
k = 0;
i = i - 1;
}​​​​​
if (A[i] == 1 && k + 1 > maximal) {​​​​​
result = 0;
}​​​​​
return result;
}​​​​​
public static void main(String[] args) {​​​​​
int[] A = {​​​​​0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1}​​​​​;
System.out.println(new BugFixing4().solution(A));
}​​​​​
}​​​​​
*/
