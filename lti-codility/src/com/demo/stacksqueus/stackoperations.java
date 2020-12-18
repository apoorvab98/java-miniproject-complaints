package com.demo.stacksqueus;
/*
 * 1 stack = [0] * N
2 size = 0
3 def push(x):
4 global size
5 stack[size] = x
6 size += 1
7 def pop():
8 global size
9 size -= 1
10 return stack[size]
 */

public class stackoperations{
	int size=0;
	int n=6;
	 static int stck[]=new int[2];
	public static void main(String[] args) {

		
		stackoperations o=new stackoperations();
		o.push(5);
		o.push(8);
		
		//System.out.println(o.pop());
		for(Integer i:stck) {
			int h=i.intValue();
			System.out.println(h);
		}
	}

private void push(int x) {
	
	// TODO Auto-generated method stub
	stck[size]=x;
	size+=1;
		
	}

private int pop() {
	// TODO Auto-generated method stub

	size=size-1;
	return stck[size];
	
}
	}

