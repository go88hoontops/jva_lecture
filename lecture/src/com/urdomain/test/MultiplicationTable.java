package com.urdomain.test;
import java.util.Scanner;
public class MultiplicationTable {

	

		public static void main(String[] args) {
			MultiplicationTable multiplicationtable = new MultiplicationTable();
			multiplicationtable.MultiplicationFunction(multiplicationtable.InputNum1(), multiplicationtable.InputNum2());	
		}
//		ù ��° ���� �Է�
		public int InputNum1() {
			int inputNum1 = 0;
			System.out.print("ù ��° ���� �Է� : ");
			Scanner sc = new Scanner(System.in);
			inputNum1 = sc.nextInt();
			return inputNum1;
		}
//		�� ��° ���� �Է�	
		public int InputNum2() {	
			int inputNum2 = 0;
			System.out.print("�� ��° ���� �Է� : ");
			Scanner sc = new Scanner(System.in);
			inputNum2 = sc.nextInt();
			System.out.println("----------------------");
			sc.close();
			return inputNum2;
		}

		public void MultiplicationFunction(int num1, int num2) {
//			(num1)�� ���
			for(int i=1; i<10; i++) {
				if(num1 == i) {
					System.out.println("[" + i + "��]");
					System.out.println();
				}
			}
			for(int j=1; j<10; j++) {
				System.out.println(num1 + " " + "*" + " " + num1 + " = " + num1*j);
			}
//			���м� ���
			System.out.println("----------------------");
//			(num2)�� ��� 
			for(int k=1; k<10; k++) {
				if(num2 == k) {
					System.out.println("[" + k + "��]");
					System.out.println();
				}
			}	
			for(int l=1; l<10; l++) {
				System.out.println(num2 + " " + "*" + " " + num2 + " = " + num2*l);
			}
			System.out.println("----------------------");
		}
	}

		

	
		

