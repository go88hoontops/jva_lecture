package com.jh.ch02;

public class PromotionExam {

	public static void main(String[] args) {

		
		byte byteValue = 10;
		int intValue = byteValue; //int < byte 값을 넣는거임
		
		System.out.println(intValue);
		
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		
		
		
	}

}
