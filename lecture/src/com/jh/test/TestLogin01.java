package com.jh.test;

import java.util.Scanner;

public class TestLogin01 {

	public static void main(String[] args) {
		
		String[] user = {"urId","Email"};
	
		user[0] = "hoon";
		user[1] = "hoon@go.com";
				
		System.out.println("����� ���̵� �Է��ϼ���");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
				
		if(inputString.equals(user[0])) {
			
			System.out.println("email or ��й�ȣ�� �Է��Ͻÿ�");
		
			
			//	System.out.println("����� EMAIL�� �Է����ּ��� ");
				
					Scanner scanEmail = new Scanner(System.in);
					inputString = scanEmail.nextLine();
		
			if(inputString.equals(user[1])) {
				
				System.out.println(" Login ����~");
		
			}else {
			
				System.out.println("�ٽ�Ȯ�����ּ��� ");
		
			}
			
			
			
		}else{
			System.out.println("�ٽ�Ȯ�����ּ���");
			
			
		}
	
	}
}