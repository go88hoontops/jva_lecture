package com.jh.ch04;

public class IfNestedExam {

	public static void main(String[] args) {

		int Score = (int)(Math.random()*20) +81;
		System.out.println("���� : " + Score);
		
		
		
		String grade = null;//�ʱ�ȭ ���ϴϱ� ������.
		
		if(Score >= 90) {
			if(Score >95) {
				grade = "A+";
			}else {
				grade ="A";
			}
		}else {
				if(Score >=80){
				if(Score >=85) {
						grade ="B+";
			}
				
				else {
						grade="B";
			}
				}
				
				
			}
		
		System.out.println("���� : = " + grade);
		} 
	}


