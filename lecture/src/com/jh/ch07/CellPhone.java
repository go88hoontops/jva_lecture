package com.jh.ch07;
	
public class CellPhone {

	//�ʵ�
		String model;
		String color;
		
//������ �н�
		
	//�޼ҵ�
		
		void powerOn() {System.out.println("����Ŵ");}
		void powerOff() {System.out.println("������");}
		void bell () {System.out.println("���︲");}
		void sendVoice(String message) {
			System.out.println("�ڱ� :"+ message);
		}
		void getVoice (String message) {
			System.out.println("��� :"+message);
		}
		
		void hangUp() {System.out.println("��ȭ����");}
		
		
		
}
