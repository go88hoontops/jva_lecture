package com.done.test;

import java.util.Scanner;

public class FindIdTest {

	public static void main(String[] args) {
		
		String[] user = {"urId","Email",""};
	
		user[0] = "hoon";
		user[1] = "hoon@go.com";
		user[2] = "0202020";
		
		
		
		System.out.println("당신의 아이디를 입력하세요");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
				
		if(inputString.equals(user[0])) {
				System.out.println("비밀번호를 입력하세요");
				
					Scanner scanPass = new Scanner(System.in);
					inputString = scanPass.nextLine();
		
			if(inputString.equals(user[2])) {
				
				System.out.println("로그인되었습니다");
		
		 if(inputString.equals(user[2])) {
			
				System.out.println("다시 시도하세요.");
				System.out.println("이메일이 맞다면 아이디를 이메일로 전송해드립니다. ");
				
				Scanner scanEm = new Scanner(System.in);
				inputString = scanEm.nextLine();
				
				
				System.out.println("이메일로 전송했음");	
				
		 				}else {
		 					System.out.println("다시 시도하세요");
					}
			
				}		
			
			}	else{
					System.out.println("다시 시도하세요");
			
			
		
		}
	}
}