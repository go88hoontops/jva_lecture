package com.jh.ch07;

public class Student extends People{
	
	public int studentNo;
	
	
	//피플상속(부모를 상속받음) 
	public Student (String name, String ssn, int studentNo) {
		
		super (name,ssn);//부모생성자 super로 호출 매개값..
		this.studentNo = studentNo;
	}
	
	
}
