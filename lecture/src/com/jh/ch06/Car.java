package com.jh.ch06;
//field 
public class Car {

//	String company = "������";
//	String model = "�׷���";
//	String color = "������";              //-���� p200
//	int maxSpeed = 350;
//	int speed;

	String company = "������";
	String model ;
	String color ;						//p210 �����ε�
	int maxSpeed ;
	int speed;

	//=========================���� üũ and ���	
	int Gas;
	public void setGas(int gas) {
	this.Gas = gas;
		
	}
	
	public boolean isLeftGas(){
		if( Gas == 0) {
			System.out.println("��������");
			return false;
		}else {
			System.out.println("�������");
			return true;
		}
	}
	
	public void run() {
		while (true) {
			if(Gas > 0) {
				 System.out.println("���ӷ����� ��ƹ���! GAS �ܷ� :" + Gas);
				 Gas -= 1;
			}else {
				System.out.println("����ϴ�! GAS ����! " + Gas );
			return;
			}
		}
	}
	////========================================���� �����ε� (������)
	Car(){
		
	}
	Car(String model){
		this(model, "����",99);
	}
	
	Car(String model, String color){
		this(model, "����",99);
	}
	
	Car(String model, String color , int maxSpeed){
		
		this.model = model;
		this.color =color;
		this.maxSpeed=maxSpeed;
		
	}
	Car(String model, String color , int speed, int maxSpeed){
		
		this.model = model;
		this.color =color;
		this.speed = speed;
		this.maxSpeed=maxSpeed;
		
	}
	
	
	
	
	
	
	
	
	
	
//������ ver1 - ��Ծ��� ver2 ª�� ����/
	
//	Car(){
//		
//	}
//
//	Car(String model){
//		this.model = model;
//	}
//	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car(String model , String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
//	
//	Car(String model , String color, int maxSpeed,String company ,int speed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//		this.company = company;
//		this.speed = speed;
//	}
//	
//	
	public static void main(String[] args) {
								

		Car caR = new Car();

		caR.setGas(5);   //caR Ŭ���� setgas �޼ҵ� ȣ��
		
		boolean gasState = caR.isLeftGas();
		if(gasState) {
			System.out.println("���");
			caR.run();
		}
		
		if (caR.isLeftGas()) {
			System.out.println("����� �޸���");
		}else {
			System.out.println("�⸧�� ä��ÿ�!!");
		}
		
		
		System.out.println("caR.company : " + caR.company );
		System.out.println();
														//������ ������ ���
		Car car1 = new Car();                          ////1�� ������ ���Ȯ��
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
		
		System.out.println("car5.company : " + car5.company );
		System.out.println("car5.model : " + car5.model );
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.speed : " + car5.speed);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);
	
		
		
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
