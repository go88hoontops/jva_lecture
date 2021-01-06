package com.done.test;

public class Lottotest {

	public static void main(String[] args) {

		
		
		for (int i = 0; i <6; i++) {
			int b = (int)(Math.random()*45) +1;
			System.out.println("로또 예상번호 =" +b);
		}
		
		
	}

}
