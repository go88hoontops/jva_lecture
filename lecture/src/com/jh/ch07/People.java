package com.jh.ch07;

public class People {
		
	public String name;
	public String ssn;
	
	//기본생성자는 없고
	// 네임과 ssn을 매개값으로 받아 객채를 생성시키는 생성자만
	public People (String name, String ssn) {
		this.name=name;
		this.ssn= ssn;
	}
	
		
}
