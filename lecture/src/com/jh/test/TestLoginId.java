package com.jh.test;

import java.util.Scanner;

public class TestLoginId {


	public static void Login() {
	
	}
		
	
	public static void main(String[] args) {
		
	String[] user = {"hoons","hoonhoonhoon@ooofo.com","0020"};
				
	String Id = user[0];
	String Em = user[1];
	String Ps = user[2];
	
	
	
		System.out.println("����� ���̵� �Է��ϼ���");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
	
		if(inputString.equals(Id)) {
			
			
			System.out.println("��й�ȣ�� �Է��ϼ���");
		
			Scanner scanPs = new Scanner(System.in);
			String inputString1;
			inputString1  = scanPs.nextLine();
				
			if(inputString1.equals(Ps)) {
			
				System.out.println("����");
			
			}else {
				System.out.println("�ٽ�Ȯ�����ּ���, ��й�ȣ�� ã������ �̸����� �����ּ���");

				Scanner scanEm = new Scanner(System.in);
				String inputString2;
				inputString2  = scanEm.nextLine();
				
				if(inputString2.equals(Em)) {
					System.out.println("�߼۵Ǿ����ϴ� �̸��Ͽ� ���� Ȯ���غ���");
				}else {
					System.out.println("�ٽ�Ȯ����");
				}
			}
			
			
		}else {
			System.out.println("�ٽ�Ȯ�����ּ���");
			
		}
		 
		
		}
	}
