package com.done.test;

public class TestlogIn {

	public static void main(String[] args) {

		//javascript > JSP > JAVA �Ѿ�Ӵٴ� ����
		//�α��� ȭ�鿡�� �Է��� �����Ͱ� �̰����� �����޴ٶ�� �����ϰ� �α����� ���������� �Ǹ� 
		//�������� �޼��� ��� �ƴϸ� ������ �޼��� ���
		
		TestlogIn testlogIn = new TestlogIn();
		
		String[] user = {"urid","urpass"};//db�� ����
		
		String Id = user[0];
		String Ps = user[1];
		
		String result = testlogIn.checkLogin(Id, Ps);
		System.out.println(result);
		
//		if (user[0].equals(Id)==user[1].equals(Ps)) {			
//			System.out.println("�α��� �Ǿ����ϴ�");
//		}else {
//			System.out.println("�ٽ� �õ��ϼ���");
//		}
	}
	
	public String checkLogin(String id, String ps) {
		String msg = "";
		
		
		
		return msg;
	}

}
