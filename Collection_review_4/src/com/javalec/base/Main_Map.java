package com.javalec.base;

import java.util.HashMap;

public class Main_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(10, "str10");
		hashMap.put(20, "str20");
		hashMap.put(30, "str30");
		hashMap.put(40, "str40");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(20));
				
		hashMap.remove(20);
		System.out.println(hashMap);
		
		hashMap.clear();
		System.out.println(hashMap);
		
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		
		hashMap2.put("a", "apple");
		hashMap2.put("b", "banana");
		hashMap2.put("c", "coke");
		
		System.out.println(hashMap2);
		
		System.out.println(hashMap2.get("b"));
		
		hashMap2.remove("a");
		System.out.println(hashMap2);
		
		hashMap2.clear();
		System.out.println(hashMap2);
		
	}

}
