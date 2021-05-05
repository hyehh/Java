package com.javalec.function;

public class DmbCellPhone extends CellPhone {

	//Field
	public int channel;
	
	// Constructor
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
		super();
		this.model = model;
		this.color= color;
		this.channel = channel;
	}
	
	//Method
	public void turnDmbOn() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작 합니다.");
	}
	
	public void changeDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 " + channel + "으로 바꿉니다.");
	}
	
	public void stopDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	

}
