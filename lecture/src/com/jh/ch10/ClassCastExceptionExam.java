package com.jh.ch10;

public class ClassCastExceptionExam {

	
	
	public static void main(String[] args) {

		try {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new cat();
		changeDog(cat);
		
		}catch(ClassCastException e) {
			System.out.println("calssCastException e");
		} finally {
			System.out.println("공부 시작");
		}
		
		}
		
		
		
		public static void changeDog(Animal animal){
			if(animal instanceof Dog) {
				
				Dog dog = (Dog) animal;
			}else {
				
			}

		}
	
		class Animal{}
		class Dog extends Animal{}
		class Cat extends Animal{	}
		
	}

