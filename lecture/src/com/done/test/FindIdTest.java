package com.done.test;

import java.util.Scanner;

public class FindIdTest {

	public static void main(String[] args) {
		
		String[] user = {"urId","Email",""};
	
		user[0] = "hoon";
		user[1] = "hoon@go.com";
		user[2] = "0202020";
		
		
		
		System.out.println("����� ���̵� �Է��ϼ���");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
				
		if(inputString.equals(user[0])) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				
					Scanner scanPass = new Scanner(System.in);
					inputString = scanPass.nextLine();
		
			if(inputString.equals(user[2])) {
				
				System.out.println("�α��εǾ����ϴ�");
		
		 if(inputString.equals(user[2])) {
			
				System.out.println("�ٽ� �õ��ϼ���.");
				System.out.println("�̸����� �´ٸ� ���̵� �̸��Ϸ� �����ص帳�ϴ�. ");
				
				Scanner scanEm = new Scanner(System.in);
				inputString = scanEm.nextLine();
				
				
				System.out.println("�̸��Ϸ� ��������");	
				
		 				}else {
		 					System.out.println("�ٽ� �õ��ϼ���");
					}
			
				}		
			
			}	else{
					System.out.println("�ٽ� �õ��ϼ���");
			
			
		
		}
	}
}