package Practice0104;
// �ణ ȸ������ �����ε�..  �����ε� �κп� �̸� ���� ������ �߹޾Ƽ�..
// Ŭ������ �ְ� �����ڷ� �ް�? ?? ? ?? ??
public class Car {
//�ʵ�//
	
	String name ;
	String brand;
	String comeFrom;
	String dealer;
	int speed;
	int maxSpeed;
	
// ������//	
	Car(String nm, String br,String cf, String dl, int sp, int ms){
		this.name = nm;
		this.brand = br;
		this.comeFrom = cf;
		this.dealer = dl;
		this.speed = sp;
		this.maxSpeed = ms;
		}
	
	
	
	
public static void main(String [] args) {
//�����ڴ� �����ε� �Ҷ� ������ Ȯ���ϰ� �����ε� ��ä�� Ȯ���ؾ���.	
	
	Car car1 = new Car("SL600 2020 new","Mercedes_Benz","German","�Ѽ��ڵ���",99,399);
	
	System.out.println("�ش� ������ " + car1.name);
	System.out.println("������� "+ car1.brand);
	System.out.println("�������� " + car1.comeFrom+ "�Դϴ�.");
	System.out.println("���� �ִ� �ǸŻ��"+car1.dealer +"�̸�~");
	System.out.println("�ִ� ���� ���� �ӵ���" + car1.speed+"�Դϴ�" );
	System.out.println("�ִ�ӵ��� " +car1.maxSpeed +"�Դϴ� :) ");
	
	
	
	
	}

}
