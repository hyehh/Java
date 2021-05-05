package com.javalec.base;

import java.util.ArrayList;

import com.javalec.function.Student;

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
			System.out.println(arrayList.get(i).name +"\t\t" + arrayList.get(i).score);
		}
	}

}
