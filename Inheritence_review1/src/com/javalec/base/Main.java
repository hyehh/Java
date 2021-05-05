package com.javalec.base;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DmbCellPhone newphone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : " + newphone.model);
		System.out.println("색상 : " + newphone.color);
		System.out.println("채널 : " + newphone.channel);
		
		newphone.turnOn();
		newphone.turnOff();
		newphone.sendVoice("여보세요");
		newphone.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		newphone.sendVoice("아! 반값습니다. 그럼 안녕히~~~");
		newphone.turnDmbOn();
		newphone.changeDmb(12);
		newphone.stopDmb();
	}

}
