package com.javalec.function;

public class Array {


	public Array() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] plusResult(int array[]) {
		int[] tot = new int[array.length];
		for(int i=0; i<array.length; i++) {
			tot[i] = array[i] + 1;
		}return tot;
	}

	
}
