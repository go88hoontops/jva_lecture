

package Practice0104;
//�̸� ���� ����ó �Է¹޾� ��������
import java.util.Scanner;

public class MethodStringPractice {


	public void StringPractice(String op, int op1, String op2) {
	
		if (op1 < 100){
		if (op.equals("������")) {
			System.out.println("�̸��� ��ġ�մϴ�");
		}else {
			System.out.println("�ٽ�Ȯ�����ּ���"); 
			
		} System.out.println("����1");
			
		if(op1 > 20) {
			System.out.println("�����Դϴ�"); 
		}else {
			System.out.println("�ٽ� Ȯ�����ּ���"); 
		} System.out.println("����2");
			
		
		if (op2.equals("01045919123")) {
			System.out.println("���������� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ٽ� Ȯ�����ּ���.");
			
		} System.out.println("����3");
		}
		System.out.println(" ����");
	}

	
	
	
	public static void main(String[] args) {

		MethodStringPractice methodStringPractice = new MethodStringPractice();
		
		Scanner scs = new Scanner(System.in);

		System.out.println("�̸��� �Է��Ͻÿ�");
		String op = scs.nextLine();

//		methodStringPractice.StringPractice(name, age, number);
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int op1 = scs.nextInt();
		System.out.println("");
		System.out.println("����ó�� �Է��Ͻÿ�");
		String op2 = scs.nextLine();
		System.out.println("");
		String result = "";
		
//		methodStringPractice.StringPractice(op, op1, op2);

	}
}
