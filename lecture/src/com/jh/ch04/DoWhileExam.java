package com.jh.ch04;


import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {

		System.out.println("�޼����� �Է��Ͻÿ�");
		System.out.println("���α׷��� �����Ͻ÷��� 'Q' �� ��������");
		
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do{
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("Q"));
		
		scanner.close();
		
		System.out.println();
		System.out.println("���α׷�����");
		
	}

}
