package com.jh.ch05;

public class StringEqualsExalm {

	public static void main(String[] args) {

		
			String strVar1 = "�Ź�";
			String strVar2 = "�Ź�";
			
			
			if(strVar1 == strVar2) {
				System.out.println("var1 �� var2 �� ������ ����");
				
			}else {
				
				System.out.println("var1�� var2�� ������ �ٸ�");
			}
			
			if(strVar1.equals(strVar2)) {
				System.out.println("var1 �� var2 �� ���ڿ��� ����");
			}
			
			String strVar3 = new String("������");
			String strVar4 = new String("������");
			
			if (strVar3 == strVar4) {
				
				System.out.println("var3 �� var4�� ������ ����");
			}else {
				
				System.out.println("var3�� var4�� ������ �ٸ�");
			}
			
			
			if(strVar3.equals(strVar4)) {
				System.out.println("var3�� var4�� ���ڿ��� ����");
			}else {
				System.out.println("var3 �� var4�� ���ڿ��� �ٸ�");
			}
	}

}
