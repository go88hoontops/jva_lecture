package com.jh.ch04;

public class IfDiceExam {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6 )+1;
		
		
		if (num==1){
			System.out.println("1���� ���ӽ��ϴ�");
		}else if(num==2){
			System.out.println("2���� ���ӽ��ϴ�");
		}else if(num==3){
			System.out.println("3���� ���ӽ��ϴ�");
		}else if(num==4){
				System.out.println("4���� ���ӽ��ϴ�");
		}else if(num==5){
			System.out.println("5���� ���ӽ��ϴ�");		
		}	else if(num==6){
			System.out.println("6���� ���ӽ��ϴ�");		
		}	
		
	}

}
