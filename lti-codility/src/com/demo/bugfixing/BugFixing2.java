package com.demo.bugfixing;

import java.util.Arrays;

//return the minimal value that occurs in both the arrays
//if no match found return -1
public class BugFixing2 {

	int solution(int[] A, int[] B) {
      int n = A.length;
      int m = B.length;
      int y=0;
      Arrays.sort(A);
      Arrays.sort(B);
      int i = 0;
      for (int k = 0; k < n && m!=0;) {
    	  System.out.println("k+"+k);
          if (A[k] == B[i]) { 
        	  y=A[k];
        	  System.out.println("Y: "+y);
              return A[k];
          } 
           //if (i < m-1  && B[i] <= A[k])//changed m-1 to m//change to while 
          if (i < m-1  && B[i] < A[k])  //changed from <= to <  
        	  i += 1;
           else {
        	   k++;
           }
      }
      return -1;
  }
	
	public static void main(String[] args) {
		int[] A = {};//{6,7 ,5 , 8};
		int[] B = {6};//{7, 77, 6, 9};
		System.out.println(new BugFixing2().solution(A, B));
	}

}

//import java.util.Arrays;
//
////return the minimal value that occurs in both the arrays
////if no match found return -1
//public class BugFixing2 {
//
//int solution(int[] A, int[] B) {
//int n = A.length;
//int m = B.length;
//Arrays.sort(A);
//Arrays.sort(B);
//int i = 0;
//for (int k = 0; k < n; ) {
//if (A[k] == B[i])
//return A[k];
//if (i < m-1 && B[i] < A[k])
//i += 1;
//else
//k+=1;
//}
//return -1;
//}
//public static void main(String[] args) {
//int[] A = {2, 4, 6, 7};
//int[] B = {2, 1, 1, 8};
//System.out.println(new BugFixing2().solution(A, B));
//}
//}
//}
/*
[7:37 PM] Simant Setu

//return the minimal value that occurs in both the arrays
//if no match found return -1
public class BugFixing2 {​​​​​

int solution(int[] A, int[] B) {​​​​​
int n = A.length;
int m = B.length;
Arrays.sort(A);
Arrays.sort(B);
int i = 0;
for (int k = 0; k < n; ) {​​​​​
if (A[k] == B[i])
return A[k];
if (i < m-1 && B[i] > A[k])
i += 1;
else
k+=1;
}​​​​​
return -1;
}​​​​​
public static void main(String[] args) {​​​​​
int[] A = {​​​​​2, 4, 6, 7}​​​​​;
int[] B = {​​​​​2, 1, 1, 8}​​​​​;
System.out.println(new BugFixing2().solution(A, B));
}​​​​​
}​​​​​
*/