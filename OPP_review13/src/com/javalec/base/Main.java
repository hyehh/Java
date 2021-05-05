package com.javalec.base;

import com.javalec.function.Child1;
import com.javalec.function.Child2;
import com.javalec.function.Child3;
import com.javalec.function.Origin;
import com.javalec.function.PriceMenu;

public class Main {
	
	public static void main(String[] args) {
		
	
	Origin child1 = new Child1(PriceMenu.RICE, PriceMenu.BULGOGI, PriceMenu.BANANA, PriceMenu.MILK, PriceMenu.ALMOND);
	Origin child2 = new Child2(PriceMenu.RICE, PriceMenu.BULGOGI, PriceMenu.BANANA, PriceMenu.MILK, PriceMenu.ALMOND);
	Origin child3 = new Child3(PriceMenu.RICE, PriceMenu.BULGOGI, PriceMenu.BANANA, PriceMenu.MILK, PriceMenu.ALMOND);

	System.out.println("Child1의 식비 : " + child1.calc());
	System.out.println("Child2의 식비 : " + child2.calc());
	System.out.println("Child3의 식비 : " + child3.calc());

	
	// Child1에서 Method void 가 아닌 int 로 주었기 때문에 syso해주어야 함!
	
	

	}
}
