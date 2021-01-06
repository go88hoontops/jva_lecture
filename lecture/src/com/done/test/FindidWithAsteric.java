package com.done.test;

public class FindidWithAsteric {

	//아이디찾기 ? 비번 찾기? 이메일찾기? 
	//아이디찾기하면 모두공개되지않고 **식으로 노출시키기
	//배운적없는거같은데 .. 
	

		public static void main(String[] args) {

			//이름 이메일 아이디 번호
			String[] user = {"이정훈","hoontops","111234","010-9999-1111"};
		
			String Name = user[0];
			String Em = user[1];
			String  Ps= user[2];
			String Pn = user[3];
			

		
			
			if(Name.equals(user[0]) && Pn.equals(user[3])) {
				
				Em.substring(0);
				String EmResult = Em.substring(Em.length()-3);
				String Hide = "****";
					
						
						System.out.println();
				
				System.out.println("본인인증완료");
				System.out.println("당신의 아이디는 : "+ Hide + EmResult + "  입니다");

			}else {
				System.out.println("다시 확인해주세요");
			}
			
			
			
		}

	}