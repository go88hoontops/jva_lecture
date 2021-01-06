package com.done.test;

public class LottoTest3 {

	public static void main(String[] args) {


		for (int i = 0; i <3; i++){
			int a = (int)(Math.random()*45+1);
													//System.out.println(a+"a");
			int b = (int)(Math.random()*45+2);
													//	System.out.println(b+"b");
			
			if(a ==b) {
				System.out.println("중복된숫자로 패스");
			}else {
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		
		
		

		
	}

}
