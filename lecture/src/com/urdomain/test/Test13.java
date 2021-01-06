package com.urdomain.test;

public class Test13 {


	public String changeIdWithAsterisk (String Id) {
			
			char[] idCharArray = Id.toCharArray();
			
		//	for(char idChar : idCharArray) {
		//		System.out.println(idChar);
		//	}		
			
			if(Id.length() >= 1 && Id.length() < 3) {
				//	pass
			} else if (Id.length() == 3) {
				//	1
				idCharArray[1] = '*';
			} else if (Id.length() == 4 || Id.length() == 5) {
				//	1,2				
				idCharArray[1] = '*';
				idCharArray[2] = '*';
			} else if (Id.length() == 6 || Id.length() == 7 ) {
				//	3,4
				idCharArray[3] = '*';
				idCharArray[4] = '*';			
			} else if (Id.length() >= 8 && Id.length() <= 10) {
				//	4,5			
				idCharArray[4] = '*';
				idCharArray[5] = '*';
			} else {	 //	(id.length() >= 11 && id.length() <= 20)
				// 6,7,8
				idCharArray[6] = '*';
				idCharArray[7] = '*';
				idCharArray[8] = '*';
			}		
		//	String idNew = String.valueOf(idCharArray);
		//	System.out.println(idNew);
			
			return String.valueOf(idCharArray);
		}


		public void ChangeOtherOne (String Email) {
			
		//	String changedName = "";
			char[] Oemail = new char[Email.length()];
		

			for(int i = 0 ; i < Email.length(); i++) {
			
				if ((Email.length() / 2) - 2 <= i && i < (Email.length() /2 ) + 2){
						
					Oemail[i] = '*'+'*';
					
					
				}else if ((Email.length() / 3 ) -2 <= i && i < (Email.length() / 3) +2) {
					
					 Oemail[i] = '^'+'^';
				}else {
					
				}
			}
		}

	public static void main(String[] args) {

		String[] User = {"hooontops","ÀÌÁ¤ÈÆ","chicmentor@gmail.com"};
		
		String Id = "hoontopssss";
		String Email = "chic@gmail.com";

		Test13 test13 = new Test13();
		
		String idNew = test13.changeIdWithAsterisk(Id);
		String NewId = User[0];
		String Oemail = test13.changeIdWithAsterisk(Email);
		
		
		
		System.out.println(idNew);
		System.out.println(NewId);
		System.out.println(Oemail);
	}

}
