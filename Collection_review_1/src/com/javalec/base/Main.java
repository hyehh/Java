package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ArrayList복습하기
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println("<<<<<<< ArrayList >>>>>>>");
		
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		System.out.println(arrayList);
		System.out.println(arrayList.toString());

		// ArrayList에서 데이터 불러오기
		String str10 = arrayList.get(3);
		System.out.println("Index 3 = " + str10);
		System.out.println("Index 3 = " + arrayList.get(3));
		
		// ArrayList의 특정 index의 data 수정하기(1번지 내용을 str222로 바꾸기)
		arrayList.set(1, "str2222");
		System.out.println(arrayList.get(1));
		System.out.println(arrayList);
		
		// ArrayList 크기 확인하기
		int size = arrayList.size();
		System.out.println("Size : " + size);
		System.out.println("Size : " + arrayList.size());
		
		// ArrayList 내용 삭제하기
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.remove("str4");
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList);
		
		// LinkedList복습하기
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("<<<<<<< LinkedList >>>>>>>");

		linkedList.add("str1");
		linkedList.add("str2");
		linkedList.add("str3");
		linkedList.add("str4");
		
		System.out.println(linkedList);
		System.out.println(linkedList.toString());
		
		String str12 = linkedList.get(3);
		System.out.println("Index 3 = " + str12);
		System.out.println("Index 3 = " + linkedList.get(3));
		
		linkedList.set(1, "str2222");
		System.out.println(linkedList.get(1));
		System.out.println(linkedList);
		
		int size2 = linkedList.size();
		System.out.println("Size : " + size2);
		System.out.println("Size : " + linkedList.size());
		
		linkedList.remove(1);
		System.out.println(linkedList);
		linkedList.remove("str4");
		System.out.println(linkedList);
		
		linkedList.clear();
		
		
		// Vector복습하기
		
		Vector<String> vector = new Vector<String>();
		
		System.out.println("<<<<<<< Vector >>>>>>>");

		vector.add("str1");
		vector.add("str2");
		vector.add("str3");
		vector.add("str4");
		
		System.out.println(vector);
		System.out.println(vector.toString());
		
		String str123 = vector.get(3);
		System.out.println("Index 3 = " + str123);
		System.out.println("Index 3 = " + vector.get(3));
		
		vector.set(1, "str2222");
		System.out.println(vector.get(1));
		System.out.println(vector);
		
		int size3 = vector.size();
		System.out.println("Size : " + size3);
		System.out.println("Size : " + vector.size());
		
		vector.remove(1);
		System.out.println(vector);
		vector.remove("str4");
		System.out.println(vector);
		
		vector.clear();
		
		
		
		
		
	}

}
