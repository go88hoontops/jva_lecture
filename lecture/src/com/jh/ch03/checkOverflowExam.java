package com.jh.ch03;

public class checkOverflowExam {
	
	public static void main (String[] args) {
		
		try {
			
				int result = safeAdd(2000000000, 2000000000);
				
				System.out.println(result);
				
		} catch(ArithmeticException e) {
			
			System.out.println("�����÷ο찡 �߻��ؼ� ��Ȯ�Ѱ�� �Ұ�");      //ĳġ�� ����ó��
								
				}
	}
	
	
	public static int safeAdd(int left, int right) {
		
		if((right > 0)) {
			if(left >(Integer.MAX_VALUE - right)) {                             //���ܹ߻� �ڵ�
				
				throw new ArithmeticException(" �� �� �� �� �� �� ��");
				
			}
		} else {
				if(left < (Integer.MIN_VALUE - right)) {                             //���ܹ߻� �ڵ�
				
				throw new ArithmeticException(" �� �� �� �� �� �� ��");
				
			
				}
		}
		
		return left  + right ;
	}
	
	
	
}
