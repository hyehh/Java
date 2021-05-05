package com.javalec.base;

import java.util.HashSet;

public class Main_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		
		System.out.println(hashSet);
		
		
		hashSet.remove("a");
		System.out.println(hashSet);
		
		hashSet.clear();
		System.out.println(hashSet);
		
	}

}
