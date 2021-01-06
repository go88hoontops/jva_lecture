package com.jh.ch06;

public class Calculator {
	
	void powerOn () {
			System.out.println("전원켜집니다");
			}
	
	int plus(int a ,int b) {
	int result  = a + b;
	return result;
	}
	
	double devide (int a, int b) {
	double result = (double)a / (double)b;
	return result;
	}
	
	
	void off() {
		 System.out.println("전원을끕니다.");
	}
	
	
	public static void main(String[] args) {

	
		Calculator calculator = new Calculator(); //객체생성 
		
		calculator.powerOn();
		
		
		int result1 = calculator.plus(6, 8);
		System.out.println(result1);
		double result2 = calculator.devide(9, 18);
		System.out.println(result2);
	
		calculator.off();
	
	}
	
	

}
