package com.demo.bugfixing;

import java.util.ArrayList;

public class BugFixing1 {
	//return the character that occurs the most frequently in the given string
    //in case of more than one character satisfying the requirement, we need to
    //return the earliest character alphabetically
    String solution(String S) {
        int[] occurrences = new int[27];
        ArrayList<Character> f=new ArrayList<Character>();
        for (char ch : S.toCharArray()) {
        	int z=occurrences[ch - 'a'];
        	System.out.println("occ:"+z);
            occurrences[ch - 'a']++;
            //System.out.println(z);
        }
        char best_char = ' ';//char best_char = 'a';
        int best_res = 0;
        for (int i = 0; i < 26; i++) {//all chars
            if (occurrences[i] > best_res) {
                best_char = (char) ((int) 'a' + i);               
                best_res = occurrences[i];
                if(best_res==1) {
                	f.add(best_char);
                }                             
                
                System.out.println("Best res:"+best_res);
            }
        }
        //System.out.println("Best cahr:"+f.get(0));
        return Character.toString(best_char);
    }
    
    
    public static void main(String[] args) {
        //System.out.println(new BugFixing1().solution("apple"));
    	System.out.println(new BugFixing1().solution(""));
    	System.out.println(new BugFixing1().solution("heello"));
    	System.out.println(new BugFixing1().solution("parameter"));
    	
    }
}
/*
public class Problem4 {



//return the character that occurs the most frequently in the given string
//in case of more than one character satisfying the requirement, we need to
//return the earliest character alphabetically
String solution(String S) {
    int[] occurrences = new int[26];
    for (char ch : S.toCharArray()) {
        occurrences[ch - 'a']++;
    }
    char best_char = 'a';
    int best_res = 0;
    for (int i = 1; i < 26; i++) {
        if (occurrences[i] >= best_res) {
            best_char = (char) ((int) 'a' + i);
            best_res = occurrences[i];
        }
    }







    return Character.toString(best_char);
}

public static void main(String[] args) {
    System.out.println(new Problem4().solution("hello"));
    System.out.println(new Problem4().solution("apple"));
    System.out.println(new Problem4().solution("parameter"));
}
}
*/