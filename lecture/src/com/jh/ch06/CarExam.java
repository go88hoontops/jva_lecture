
package com.jh.ch06;

public class CarExam {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company );
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		
		System.out.println("car2.company : " + car2.company );
		System.out.println("car2.model : " + car2.model );
		System.out.println();
		

		Car car3 = new Car("�ڰ���", "����");
		
		System.out.println("car3.company : " + car3.company );
		System.out.println("car3.model : " + car3.model );
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("�ڰ���", "����", 99);
		
		
		System.out.println("car4.company : " + car4.company );
		System.out.println("car4.model : " + car4.model );
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		Car car5 = new Car("�ڰ���","����",89,500);
		
		
		System.out.println("car5.model : " + car5.model );
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);
		System.out.println("car5.company : " + car5.company );
		System.out.println("car5.Speed : " + car5.speed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		//��ä car ���� �̰� Car Ŭ������ ������
//		Car car = new Car();
//															===p200 ó���κ�	
//		
//		//Car class ���� �����Ѱ͵� �ҷ��ü�����.
//		System.out.println("����ȸ�� : " + car.company);
//		System.out.println("�𵨸� : " + car.model);
//		System.out.println("�������� : " + car.color);
//		System.out.println("���� �ְ�ӵ� : " + car.maxSpeed );
//		System.out.println("���� ����ӵ� : " + car.speed);
//		
//	
//		
//		//�ʵ尪�� �����Ҽ�����.
//		car.speed = 60;
//	
//		System.out.println("������. ����ӵ� : " + car.speed);
//		
	}

}			
