package com.jh.ch07;

public  class Cat extends Animal {

	public Cat() {
		this.kind ="포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야 옹");
	}
	
	
}