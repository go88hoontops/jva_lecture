package com.jh.ch04;

import java.io.IOException;

public class WhileKeyControlExam {

	public static void main(String[] args) throws IOException {

		
		
			boolean run = true;
			int speed = 0;
			int keycode = 0;
			
			
		while(run) {
			
			if(keycode !=13 && keycode != 10) {
				System.out.println("==========");
				System.out.println("1.���� : 2.���� : 3.����");
				System.out.println("==========");
				System.out.println("���� : ");
					
			}
			
			
			keycode = System.in.read();
			
			if (keycode == 49) {
				speed++;
				System.out.println(" ����ӵ� =" +speed);
			}else if(keycode ==50) {
				speed --;
				System.out.println(" ����ӵ� =" +speed);
			}else if (keycode ==51) {
				run = false;
				
			}
		}
		
		System.out.println("����");
		
	}

}
