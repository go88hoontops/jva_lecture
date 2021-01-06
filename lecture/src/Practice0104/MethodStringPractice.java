

package Practice0104;
//이름 나이 연락처 입력받아 성인인증
import java.util.Scanner;

public class MethodStringPractice {


	public void StringPractice(String op, int op1, String op2) {
	
		if (op1 < 100){
		if (op.equals("이정훈")) {
			System.out.println("이름이 일치합니다");
		}else {
			System.out.println("다시확인해주세요"); 
			
		} System.out.println("다음1");
			
		if(op1 > 20) {
			System.out.println("성인입니다"); 
		}else {
			System.out.println("다시 확인해주세요"); 
		} System.out.println("다음2");
			
		
		if (op2.equals("01045919123")) {
			System.out.println("본인인증이 완료되었습니다.");
		}else {
			System.out.println("다시 확인해주세요.");
			
		} System.out.println("다음3");
		}
		System.out.println(" 종료");
	}

	
	
	
	public static void main(String[] args) {

		MethodStringPractice methodStringPractice = new MethodStringPractice();
		
		Scanner scs = new Scanner(System.in);

		System.out.println("이름을 입력하시오");
		String op = scs.nextLine();

//		methodStringPractice.StringPractice(name, age, number);
		
		System.out.println("나이를 입력하시오");
		int op1 = scs.nextInt();
		System.out.println("");
		System.out.println("연락처를 입력하시오");
		String op2 = scs.nextLine();
		System.out.println("");
		String result = "";
		
//		methodStringPractice.StringPractice(op, op1, op2);

	}
}
