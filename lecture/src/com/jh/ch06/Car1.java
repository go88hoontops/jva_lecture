package com.jh.ch06;

public class Car1 {

	String model;
	int speed;
	int overspeed;
	
	Car1(String model){
		this.model = model;
	}
	
	
	Car1(String model, int overspeed){
		this.model = model;
		this.overspeed = overspeed;
	}
	
	
	void serSpeed(int speed) {
		this.speed = speed;
	}
	
	void overspeed(int overspeed) {
		
		this.overspeed= overspeed; 
	}
	
	void run () {
		for(int i =0 ; i <= 50 ; i += 10) {
			this.serSpeed(i);
			this.overspeed(i*9);
			System.out.println(this.model+ "�� �޸��ϴ�. ����ӵ��� :" +speed+"Km/h" + "�������ǵ� : "+overspeed );
		}
	}
	
	void print (int Ac) {
		System.out.println(Ac);
	}
	
	public static void main(String[] args) {

		
		Car1 car1 = new Car1("������");
		Car1 car2 = new Car1("����");
		
		
		
		car1.run();
		car2.run();
	}

}
