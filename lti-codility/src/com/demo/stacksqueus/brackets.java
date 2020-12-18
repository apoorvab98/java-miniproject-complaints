package com.demo.stacksqueus;
import java.util.*;
public class brackets {
	public static int solution(String S) {
		int a=0;
		if( S.isEmpty() ){
            return 1;
        }
		Stack<Character>s=new Stack<Character>();
		
		for(int i=0;i<S.length();i++) {
			
			if(S.charAt(i)=='(') {
				s.push(S.charAt(i));
			}
			else if(S.charAt(i)=='[') {
				s.push(S.charAt(i));
			}
			else if(S.charAt(i)=='{') {
				s.push(S.charAt(i));
			}
			
			else if(!s.empty() && S.charAt(i)==')') {
				char a1=s.peek();
				if(a1=='(') {
					s.pop();
					
				}
			}
			else if(!s.empty() && S.charAt(i)==']') {

				char a1=s.peek();
				if(a1=='[') {
					s.pop();//continue;
					
				}
				
			}
			else if(!s.empty()&& S.charAt(i)=='}') {
				//s.push(S.charAt(i));
				//s.push(S.charAt(i));
				char a1=s.peek();
				if(a1=='{') {
					s.pop();//continue;
					
				}
			}
			else{
				s.push(S.charAt(i));
			}
			

			
		}
		if( !s.isEmpty() ){
            return 0;
        }
        else{
            return 1;
        }
		
		
	}
	public static void main(String[] args) {
		String  S = "{[(()]}";
		System.out.println(solution(S));
	}
}
