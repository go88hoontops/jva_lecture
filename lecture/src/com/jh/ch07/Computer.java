package com.jh.ch07;

public class Computer extends Calculator {
	
	 @Override
	 double areaCircle(double r) {
		 System.out.println("Coputer ��ä(class)�� areaCircle() ����");
		 
		 return Math.PI * r * r;
	 }
	
}