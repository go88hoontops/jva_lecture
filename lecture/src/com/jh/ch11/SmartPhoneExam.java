package com.jh.ch11;

public class SmartPhoneExam {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		System.out.println(myPhone);
	}

}
