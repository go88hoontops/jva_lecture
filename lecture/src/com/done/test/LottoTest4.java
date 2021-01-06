package com.done.test;

public class LottoTest4 {

	public static void main(String[] args) {
			
			int[] number = new int[6];
			
			for(int i=0; i<number.length; i++) {

			
				number[i] = (int)(Math.random()*45) + 1;

				System.out.println(number);
				for(int j=0; j<i; j++) {
				
					if(number[i] == number[j]) {
						System.out.println("²Î");
						i--;
					
					}
				
				}
			
			}
			
			for(int i=0; i<number.length; i++)
					System.out.print(number[i] + "\t");
		}
	}

