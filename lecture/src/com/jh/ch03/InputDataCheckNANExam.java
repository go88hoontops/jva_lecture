package com.jh.ch03;

public class InputDataCheckNANExam {

	public static void main(String[] args) {

		
		String userInput = "NAN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		
		
		
		
		if(Double.isNaN(val)){
			
			System.out.println("NAN �� �ԷµǾ� ó������");
			val = 0.0;
					
			
		}
		
		currentBalance += val ;
		System.out.println(currentBalance);
		
		
	}

}
