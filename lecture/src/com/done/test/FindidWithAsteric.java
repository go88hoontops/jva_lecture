package com.done.test;

public class FindidWithAsteric {

	//���̵�ã�� ? ��� ã��? �̸���ã��? 
	//���̵�ã���ϸ� ��ΰ��������ʰ� **������ �����Ű��
	//��������°Ű����� .. 
	

		public static void main(String[] args) {

			//�̸� �̸��� ���̵� ��ȣ
			String[] user = {"������","hoontops","111234","010-9999-1111"};
		
			String Name = user[0];
			String Em = user[1];
			String  Ps= user[2];
			String Pn = user[3];
			

		
			
			if(Name.equals(user[0]) && Pn.equals(user[3])) {
				
				Em.substring(0);
				String EmResult = Em.substring(Em.length()-3);
				String Hide = "****";
					
						
						System.out.println();
				
				System.out.println("���������Ϸ�");
				System.out.println("����� ���̵�� : "+ Hide + EmResult + "  �Դϴ�");

			}else {
				System.out.println("�ٽ� Ȯ�����ּ���");
			}
			
			
			
		}

	}