package com.jh.ch07;

public class Student extends People{
	
	public int studentNo;
	
	
	//���û��(�θ� ��ӹ���) 
	public Student (String name, String ssn, int studentNo) {
		
		super (name,ssn);//�θ������ super�� ȣ�� �Ű���..
		this.studentNo = studentNo;
	}
	
	
}
