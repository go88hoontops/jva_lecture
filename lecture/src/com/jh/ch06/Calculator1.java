package com.jh.ch06;
//������� ���
//�ϴ� ����ƽ���� ��ü������ �����Ҽ�����
//��������� �ν��Ͻ� �� ���̴� ��ü���� �������־���� DATA �� ����
public class Calculator1 {

	static double pi = 3.145159;
	
	static int plus(int x , int y) {
		return x + y ;
		}
	
	static int minus (int x, int y) {
		return x - y;
		}
	
	
	
	public static void main(String[] args) {

		
		double resutl1 = 10* 10* pi;
										
		int result2 = Calculator1.plus(10, 20);
		int result3 = Calculator1.minus(10, 5);
		
		
		System.out.println(resutl1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
