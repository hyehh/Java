package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student("James", 100));
		arrayList.add(new Student("Roberts", 90));
		arrayList.add(new Student("Cathy", 95));
		
		System.out.println(arrayList.get(0).name);
		System.out.println(arrayList.get(0).score);
		System.out.println(arrayList.get(0).name + arrayList.get(0).score);
		
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i).name + "\t\t");
			System.out.println(arrayList.get(i).score);
			
		}
		
		//수정
		arrayList.set(0, new Student("Jame", 90));
		
		//삭제
		arrayList.remove(0);
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i).name + "\t\t");
			System.out.println(arrayList.get(i).score);
			
		}
		
		arrayList.remove(new Student("Jame", 90));
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i).name + "\t\t");
			System.out.println(arrayList.get(i).score);
			
		}
		
	}

}
