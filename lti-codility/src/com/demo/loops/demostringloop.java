package com.demo.loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demostringloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days= {"Mon","Tues","Wed","Thurs"};
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i]+" ");
		}
		System.out.println(" ");
		for(String dname:days) {
			System.out.println(dname);
		}
		Set<String>a=new HashSet<String>();
		a.add("Mon");
		a.add("Tues");
		a.add("Wed");
		for(String day:a) {
			System.out.println("Day:"+day);
		}
		
		HashMap<String,String>hp=
				new HashMap<String,String>();
		hp.put("mon","Monday");
		hp.put("tue","Tuesday");
		for (String i : hp.keySet()) {
			  System.out.println("key: " + i + " value: " + hp.get(i));
		}
//		String d=Integer.toBinaryString(12);
//		System.out.println(d);
		
	}

}
