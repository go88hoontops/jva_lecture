package com.jh.ch07;

public class DmbCellPhone extends CellPhone {

	int channel;
	
	//�θ� Cellphone ���� �� �÷� �ʵ带 ������
	DmbCellPhone(String model, String color, int channel){
		
		this.model = model;
		this.color = color;
		this.channel = channel;
		
		
		
	}
	
	//�޼ҵ�
	
	void turnOnDmb(){
		System.out.println("DMB�� �մϴ�");
	}
	
	void changChannel() {
		System.out.println("ä��"+channel+"������ ä�κ���");
	}

	void turnOff() {
		System.out.println("����� ���ϴ�");
	}
}