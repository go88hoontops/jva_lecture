package com.jh.ch06;

public class FirstClassPractice {

	public class Car {
		
		String company = "������";
		String model = "���׽ý�";
		String color = "����";
		
		int maxSpeed = 350;
	}
	
	
	public void speedUp (int speed) {
		
		int speedCurrent = 10;
		int maxSpeed = 50;
		
		
		
		if(speedCurrent > maxSpeed) {
			
			speedCurrent += speed;
			
			
		
		}else {
			//pass
		}
		System.out.println(speedCurrent);
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		
		FirstClassPractice myCar = new FirstClassPractice();
		
//		 ���������� class Ŭ������ {
//		             () �� ���� �ִ°��� �޴°��� ���°ǰ�?
//		 fields : �Ӽ�  method :����
//		 }
//		
		
		myCar.speedUp(60);
		
		
		
	}

}
