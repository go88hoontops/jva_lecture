package com.jh.ch06;


public class Singleton {

	
	private static Singleton singleton = new Singleton();
	
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		
		
		return singleton;
	}
	
	public static void main(String[] args) {

		
		
		
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();


		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		
		if (obj1 ==obj2) {
			System.out.println("���� singleton ��ü�Դϴ�");
		}else {
			System.out.println("�ٸ� singleton ��ü�Դϴ�.");
		}
		
		if (obj3 ==obj4) {
			System.out.println("���� singleton ��ü�Դϴ�");
		}else {
			System.out.println("�ٸ� singleton ��ü�Դϴ�.");
		}
		
	}

}
