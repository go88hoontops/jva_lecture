package com.jh.test;

public class NewFindId2 {

	public static void main(String[] args) {

		String[] User= { "hoon","oooo22","hoon@nn.com"};
	
		//ª�� �ѹ濡����.
		
//		String ad = "IDqkqk";
//		String ps = "PSkaka";				�迭�� �����ϴ°Ű��Ƽ� �ٽ�
//		String Em = "hoon@nn.com";
		
		String Id = User[0];
		String Ps = User[1];
		String Em = User[2];
		
		
		
		if(User[0].equals(Id) && User[1].equals(Ps)) {
			System.out.println("����");
	
		
		}else {
			System.out.println("�ٽýõ��ϼ��� - ���̵� ã������ Email�� �Է��ϼ���");
		
			
			if(User[2].equals(Em)) {
			System.out.println("�߼۵� Ȯ��");
		
			
			}else {
				System.out.println("�ٽ�Ȯ���ϼ���");
			}
		
		}
		
		
		
	}

}
