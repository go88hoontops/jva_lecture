package com.jh.test;

public class Tinder {
// Ŭ�������� �� �ʵ忪��(������)
	
	String joinMember = null; //ȸ������
	
	String checkSnsAccount = null; //���԰��� Ÿ��= ���� ��� ��ȭ��ȣ 
	
	String googleIdCheck = null;// �����϶�
	String facebookIdCheck = null;// ����϶�
	String phoneNumberCheck = null;// ����ȣ�϶�
	
	String checkPhoneNumber = null; // ��������Ȯ��
	String sendPriviteNumber = "";
	
	
	
	boolean checkOwnNumber(int rightnumber) {
		
		boolean checkPassnumber = false;
		
	
		if(rightnumber == 92838) {
			checkPassnumber = true;
			System.out.println("�޴뺻 ���������Ϸ�");
		}else {
			System.out.println("������ȣ�� Ȯ���ϼ���");
		}	
		return checkPassnumber;
	}
	
	
	
	String joinMember (String a) {
		
		String result = a;
		if (a.equals("google")) {
			System.out.println("���۷� ȸ������");
		}else if (a.equals("facebook")) {
			System.out.println(" ���̽������� ȸ������");
		}else if (a.equals("phoneNumber")){
			System.out.println(" ����ȣ�� ȸ������");
		}
		return result;
		}
	
	
	
	
	void matchPhoneNumber0 (int number) { //�޴�����ȣ�� ��������
		
		int hisnumber = 0;
		
		if(hisnumber==number) {

			System.out.println("�޴������� ������ȣ�� �����ϴ�");
		}else {
		}		
	}
//Method Ŭ����
	
	
	
	public static void main (String[] args) {
	
	Tinder tinder = new Tinder();
	tinder.joinMember("facebook"); //�̺κ��� ȸ������ sns ����
	tinder.checkOwnNumber(92838);
	tinder.matchPhoneNumber0(0101121112);
	
	}

	}

