package com.jh.ch04;

public class SwitchNoBreakCaseExam {

	public static void main(String[] args) {
 
		
			int time = (int)(Math.random()*4) +8;
			
			System.out.println("����ð�: " +time +"��");
	
	
	
	switch(time) {
	case 8:
		System.out.println(" ���Ÿ��");
	
	case 9 :
		System.out.println(" ȸ��Ÿ��");
	
	case 10:
		System.out.println(" ����Ÿ��");
	
	default:
		System.out.println(" �ܱ�Ÿ��");
	
	}
	
	}
	
}
