package com.urdomain.test;
import java.util.Scanner;

//2021-01-04 ���� 1��.. ������..
public class MyMulti {
	
	public void Calcul1(int result , int result2) {
		
		System.out.println("\t" + result +" �� �� ��������.");
			for(int j=1; j<10 ;j++) {
				System.out.println(result + "*" + j +"="+result*j);
			}
		
		
			System.out.println("\t" + result2 +" �� �� ��������.");
			for(int j=1; j<10 ;j++) {
				System.out.println(result2 + "*" + j +"="+result2*j);
			}
	}
	
	public static void main(String[] args) {
		
		MyMulti myMulti = new MyMulti();
				
		try (Scanner sc = new Scanner(System.in)) {
			int result = 0;
			int result2 = 0;
			
			
			System.out.println("����� ����ұ�� (�����Է�)");
			result = sc.nextInt();
			
			System.out.println("����� ����ұ�� (�����Է�)");
			result2 = sc.nextInt();
			
			myMulti.Calcul1(result, result2);
		}
		
		
	}
}


//MyMulti myMulti = new MyMulti();
//
//Scanner sc = new Scanner(System.in);
//int result = 0;
//int result2 = 0;
//
//													----------������ �ϴܲ����� ��ܲ��� �ٲ� ���ҽ�
//System.out.println("����� ����ұ�� (�����Է�)");
//result = sc.nextInt();
//
//System.out.println("����� ����ұ�� (�����Է�)");
//result2 = sc.nextInt();
//
//myMulti.Calcul1(result, result2);
//

