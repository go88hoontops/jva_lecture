package Practice0104;
// 약간 회원가입 느낌인데..  오버로딩 부분에 이름 성별 같은걸 쭉받아서..
// 클래스에 넣고 생성자로 받고? ?? ? ?? ??
public class Car {
//필드//
	
	String name ;
	String brand;
	String comeFrom;
	String dealer;
	int speed;
	int maxSpeed;
	
// 생성자//	
	Car(String nm, String br,String cf, String dl, int sp, int ms){
		this.name = nm;
		this.brand = br;
		this.comeFrom = cf;
		this.dealer = dl;
		this.speed = sp;
		this.maxSpeed = ms;
		}
	
	
	
	
public static void main(String [] args) {
//생성자는 오버로딩 할때 변수명 확인하고 오버로딩 개채수 확인해야함.	
	
	Car car1 = new Car("SL600 2020 new","Mercedes_Benz","German","한성자동차",99,399);
	
	System.out.println("해당 차량은 " + car1.name);
	System.out.println("제조사는 "+ car1.brand);
	System.out.println("제조지는 " + car1.comeFrom+ "입니다.");
	System.out.println("국내 최대 판매사는"+car1.dealer +"이며~");
	System.out.println("최대 연비를 내는 속도는" + car1.speed+"입니다" );
	System.out.println("최대속도는 " +car1.maxSpeed +"입니다 :) ");
	
	
	
	
	}

}
