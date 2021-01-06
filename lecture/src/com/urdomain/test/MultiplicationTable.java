package com.urdomain.test;
import java.util.Scanner;
public class MultiplicationTable {

	

		public static void main(String[] args) {
			MultiplicationTable multiplicationtable = new MultiplicationTable();
			multiplicationtable.MultiplicationFunction(multiplicationtable.InputNum1(), multiplicationtable.InputNum2());	
		}
//		첫 번째 정수 입력
		public int InputNum1() {
			int inputNum1 = 0;
			System.out.print("첫 번째 정수 입력 : ");
			Scanner sc = new Scanner(System.in);
			inputNum1 = sc.nextInt();
			return inputNum1;
		}
//		두 번째 정수 입력	
		public int InputNum2() {	
			int inputNum2 = 0;
			System.out.print("두 번째 정수 입력 : ");
			Scanner sc = new Scanner(System.in);
			inputNum2 = sc.nextInt();
			System.out.println("----------------------");
			sc.close();
			return inputNum2;
		}

		public void MultiplicationFunction(int num1, int num2) {
//			(num1)단 출력
			for(int i=1; i<10; i++) {
				if(num1 == i) {
					System.out.println("[" + i + "단]");
					System.out.println();
				}
			}
			for(int j=1; j<10; j++) {
				System.out.println(num1 + " " + "*" + " " + num1 + " = " + num1*j);
			}
//			구분선 출력
			System.out.println("----------------------");
//			(num2)단 출력 
			for(int k=1; k<10; k++) {
				if(num2 == k) {
					System.out.println("[" + k + "단]");
					System.out.println();
				}
			}	
			for(int l=1; l<10; l++) {
				System.out.println(num2 + " " + "*" + " " + num2 + " = " + num2*l);
			}
			System.out.println("----------------------");
		}
	}

		

	
		

