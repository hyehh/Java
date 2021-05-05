package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();		
		
		for(int i=2; i<=100; i+=2) {
			arrayList.add(i);
		}
		
		System.out.println("ArrayList = " + arrayList);
		
		int tot = 0;
		for(int i=0; i<arrayList.size(); i++) {
			tot += arrayList.get(i);
		}
		
		System.out.println("짝수의 합 = " + tot);
		
		
		
		
		
		// LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for(int i=2; i<=100; i+=2) {
			linkedList.add(i);
		}
		
		System.out.println("LinkedList = " + linkedList);
		
		int tot2 = 0;
		for(int i=0; i<linkedList.size(); i++) {
			tot2 += linkedList.get(i);
		}
		
		System.out.println("짝수의 합 = " + tot2);
		
		
		
		
		//Vector
		Vector<Integer> vector = new Vector<Integer>();
		
		for(int i=2; i<=100; i+=2) {
			vector.add(i);
		}
		
		System.out.println("Vector = " + vector);
		
		
		int tot3 = 0;
		for(int i=0; i<vector.size(); i++) {
			tot3 += vector.get(i);
		}
		
		System.out.println("짝수의 합 = " + tot3);
		
		
	}

}
