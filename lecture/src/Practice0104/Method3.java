package Practice0104;

public class Method3 {
	public static String Numberring (int max) {
		
		int i = max ;
		int j = 0;
		String str = "";
		
		while(j < max) {
//			System.out.println(j);
			str += j;
	
		System.out.println(str);
		j++;
		}
		
		
		return str;
	}
	
	public static void main(String[] args) {

		
		
		String result = Numberring(2);

		
	}

}
