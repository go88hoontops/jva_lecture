package com.urdomain.test;
import java.util.Scanner;

//2021-01-04 오전 1시.. 석섹스..
public class MyMulti {
	
	public void Calcul1(int result , int result2) {
		
		System.out.println("\t" + result +" 단 을 시작하지.");
			for(int j=1; j<10 ;j++) {
				System.out.println(result + "*" + j +"="+result*j);
			}
		
		
			System.out.println("\t" + result2 +" 단 을 시작하지.");
			for(int j=1; j<10 ;j++) {
				System.out.println(result2 + "*" + j +"="+result2*j);
			}
	}
	
	public static void main(String[] args) {
		
		MyMulti myMulti = new MyMulti();
				
		try (Scanner sc = new Scanner(System.in)) {
			int result = 0;
			int result2 = 0;
			
			
			System.out.println("몇단을 출력할까요 (숫자입력)");
			result = sc.nextInt();
			
			System.out.println("몇단을 출력할까요 (숫자입력)");
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
//													----------내용이 하단꺼에서 상단껄로 바뀜 리소스
//System.out.println("몇단을 출력할까요 (숫자입력)");
//result = sc.nextInt();
//
//System.out.println("몇단을 출력할까요 (숫자입력)");
//result2 = sc.nextInt();
//
//myMulti.Calcul1(result, result2);
//

