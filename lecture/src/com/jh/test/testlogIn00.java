package com.jh.test;

public class testlogIn00 {

	public static void main(String[] args) {

		//javascript > JSP > JAVA �Ѿ�Ӵٴ� ����
		//�α��� ȭ�鿡�� �Է��� �����Ͱ� �̰����� �����޴ٶ�� �����ϰ� �α����� ���������� �Ǹ� 
		//�������� �޼��� ��� �ƴϸ� ������ �޼��� ���
		
		String[] user = {"urid","urpass"};//db�� ����
		
		String Id = user[0];
		String Ps = user[1];
		
		
		if (user[0].equals(Id)) {			
			System.out.println("���̵� �����Դϴ� " +Id);
		if (user[1].equals(Ps)) {
				System.out.println("���̵�� ��й�ȣ�� �����ϴ� ����! " +Ps);
		}
		
		}else {
			System.out.println("�������� ������ �ƴմϴ�");
		}
	}

}
