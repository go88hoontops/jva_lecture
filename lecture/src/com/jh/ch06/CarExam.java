
package com.jh.ch06;

public class CarExam {

		int speed;
		
		int getSpeed() {
			return speed;
		}
		
		void keyTurnOn() {
		System.out.println("�õ� start");
		}
		
		void run() {
			
			for(int i= 10; i <=50; i+=10) {
				speed =i;
				System.out.println("�޷�~."
						+ " :" + speed +"Km/h");
			}
			
		}
		
		
	public static void main(String[] args) {

			CarExam carExam = new CarExam();
			carExam.keyTurnOn();
			carExam.run();
			int speed = carExam.getSpeed();
			System.out.println("����ӵ� :" + speed +"Km/h");
		
	}

}			
