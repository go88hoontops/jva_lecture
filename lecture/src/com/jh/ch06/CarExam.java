
package com.jh.ch06;

public class CarExam {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company );
		System.out.println();
		
		Car car2 = new Car("자가용");
		
		System.out.println("car2.company : " + car2.company );
		System.out.println("car2.model : " + car2.model );
		System.out.println();
		

		Car car3 = new Car("자가용", "빨강");
		
		System.out.println("car3.company : " + car3.company );
		System.out.println("car3.model : " + car3.model );
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("자가용", "빨강", 99);
		
		
		System.out.println("car4.company : " + car4.company );
		System.out.println("car4.model : " + car4.model );
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		Car car5 = new Car("자가용","빨강",89,500);
		
		
		System.out.println("car5.model : " + car5.model );
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);
		System.out.println("car5.company : " + car5.company );
		System.out.println("car5.Speed : " + car5.speed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		//객채 car 생성 이건 Car 클래스를 참조함
//		Car car = new Car();
//															===p200 처음부분	
//		
//		//Car class 에서 선언한것들 불러올수있음.
//		System.out.println("제작회사 : " + car.company);
//		System.out.println("모델명 : " + car.model);
//		System.out.println("차량색상 : " + car.color);
//		System.out.println("차랑 최고속도 : " + car.maxSpeed );
//		System.out.println("차량 현재속도 : " + car.speed);
//		
//	
//		
//		//필드값을 변경할수있음.
//		car.speed = 60;
//	
//		System.out.println("수정된. 현재속도 : " + car.speed);
//		
	}

}			
