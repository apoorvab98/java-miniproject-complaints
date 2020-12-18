package com.demo.bugfixing;

public class Bugfixing7 {

	 //return the longest fragment of array A in which both the numbers X and Y are
	//present equal number of times
	int solution(int X, int Y, int[] A) {
	int N = A.length;
	int result = -1;
	int nX = 0;
	int nY = 0;
	for (int i = 0; i < N; i++) {
	if (A[i] == X)
	nX += 1;
	//else if (A[i] == Y)
	if(A[i]==Y)
	nY += 1;
	if (nX == nY && nX!=0 ) // this line
	result = i;
	}
	return result;
	}
	public static void main(String[] args) {
	int X = 10;
	int Y = 10;
	int[] A = {10};
	System.out.println(new Bugfixing7().solution(X, Y, A));
	}

	
}
