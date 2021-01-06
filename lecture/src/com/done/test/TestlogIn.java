package com.done.test;

public class TestlogIn {

	public static void main(String[] args) {

		//javascript > JSP > JAVA 넘어왓다는 가정
		//로그인 화면에서 입력한 테이터가 이곳까지 도착햇다라고 가정하고 로그인이 정상적으로 되면 
		//정상접속 메세지 출력 아니면 비정상 메세지 출력
		
		TestlogIn testlogIn = new TestlogIn();
		
		String[] user = {"urid","urpass"};//db로 가정
		
		String Id = user[0];
		String Ps = user[1];
		
		String result = testlogIn.checkLogin(Id, Ps);
		System.out.println(result);
		
//		if (user[0].equals(Id)==user[1].equals(Ps)) {			
//			System.out.println("로그인 되었습니다");
//		}else {
//			System.out.println("다시 시도하세요");
//		}
	}
	
	public String checkLogin(String id, String ps) {
		String msg = "";
		
		
		
		return msg;
	}

}
