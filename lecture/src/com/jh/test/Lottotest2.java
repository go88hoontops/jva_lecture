

package com.jh.test;


import java.util.Random;

public class Lottotest2 {

	public static void main(String[] args) {

		
		
		int GetLotto[] = new int[6]; //��ȣ�� �����������ϱ� 6ĭ¥�� ���ڸ���������
		
		Random Rl = new Random(); //����Ŭ�� �����ϴ� ����Ʈ���� ����6
		
		for(int i =0; i<6; i++) {
			
			GetLotto[i] = Rl.nextInt(45)+1;
			for(int j = 0; j<i; j++){
				if(GetLotto[i] == GetLotto[j]) // �̺κ��� �ߺ��̸� i ���� -1 ������°� 
					i--;											//
				
				}
		}
		
				for(int i =0; i <6; i++)
		System.out.println(GetLotto[i] + " ");
	}

}
