package com.jh.ch05;

public class StringEqualsExam {

	public static void main(String[] args) {

		String strVal1 = "������";
		String strVal2 = "������";
		
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1 �� strVal2 �� ������ ����");
		}else {
			System.out.println("strVal1 �� strVal2 �� ������ �ٸ�");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1 �� strVal2 �� ���ڿ��� ����");
		}
		
		String strVal3 = new String("������");
		String strVal4 = new String("������");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3 �� strVal4 �� ������ ����");
		}else {
			System.out.println("strVal3 �� strVal4 �� ������ �ٸ�");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3 �� strVal4 �� ���ڿ��� ����");
		}
		
	}

} //������ ���ڰ� ��ġ�� ��ҷ� ������
