package com.jh.ch06;

public class Calculator {
	
	void powerOn () {
			System.out.println("전원켜집니다");
			}
	
	int plus(int a ,int b) {
	int result  = a + b;
	return result;
	}
	
	double divide (int x, int y) {
	double result = (double)x / (double)y;
	return result;
	}
	
	
	void off() {
		 System.out.println("전원을끕니다.");
	}
	
	
	public static void main(String[] args) {

	
		Calculator calculator = new Calculator(); //객체생성 
		
		calculator.powerOn();
		
		
		int result1 = calculator.plus(5, 6);
		System.out.println(result1);
		
		byte x =10;
		byte y =4;
		double result2 = calculator.divide(x,y);
		System.out.println(result2);
	
		calculator.off();
	
	}
	
	

}
