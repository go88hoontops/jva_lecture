package com.jh.ch07;

public class DmbCellPhoneExam {

	public static void main(String[] args) {

		
		DmbCellPhone dmbCellPhone =new DmbCellPhone("������","�׷���",99) ;
		//from cellphone
		System.out.println(" �� : "+dmbCellPhone.model);
		System.out.println(" �÷� : "+dmbCellPhone.color);
		//from dmbcellphon
		System.out.println(" ä�� : "+dmbCellPhone.channel);
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("������");
		dmbCellPhone.getVoice("�������");
		dmbCellPhone.hangUp();
		
		
		//DmbCell�� �޼ҵ�ȣ��
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changChannel();
		dmbCellPhone.turnOff();
		
	}

}
