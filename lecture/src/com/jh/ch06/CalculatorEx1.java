package com.jh.ch06;

public class CalculatorEx1 {

	double areaRectangle(double width) {
		return width * width;
		
	}
		
	
	double areaRectangle (double width , double hieght) {
		
		return width * hieght;
		
	}
	
	void print(String fd) {
		System.out.println(fd);
	}
	
	public static void main(String[] args) {

		CalculatorEx1 calculatorEx1 = new CalculatorEx1();
		
		double result1 = calculatorEx1.areaRectangle(10);
		double result2 = calculatorEx1.areaRectangle(10, 30);
		
		
		calculatorEx1.print("���簢�� ���� :" + result1  );
		calculatorEx1.print("���簢�� ���� :" + result2  );
		
		
	}

}
