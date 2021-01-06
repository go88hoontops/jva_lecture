		package com.jh.test;
		
		public class Computer {
			
			
			String brand ="조립컴퓨터";
			String startbutton;
			String moniter;
			String mobiterBrand;
			String mainBoard;
			String mainBoardBrand;
			String cpu;
			String gpu;
			String others;
			
			
		
			public int[] power () {
				//파워 만들기 500짜리 5칸	
					int[]result = new int[5];
					
					for(int i = 0 ; i < result.length;i++) {
						result[i] += 500;
						System.out.println(result[i]);
					}
						
					return result;
				}
			
			
			
			public void moniter (int[] powergetboard) {
				
				int[] use = {140};
				int result;
				
				for(int i=0; i < powergetboard.length; i++) {
					if(use[0] < powergetboard[i]) {
						result = powergetboard[i] -= use[0];
						System.out.println("사용전력"+use[0]+"모니터 전력공급..."+"남는량"+ result);
						break;
					}else {
						
					}
				}
					
			}
			
			
			public void mainboardpower (int[] powerget) {
				
				int[] use = {100};
				int result;
				
				for(int i=0; i < powerget.length; i++) {
					if(use[0] < powerget[i]) {
						result = powerget[i] -= use[0];
						System.out.println("사용전력"+use[0]+"메인보드 전력공급..."+"남는량"+ result);
					
						break;
					}else {
						System.out.println("======-----메인보드파워 전력부족-----======");
						result = powerget[i] -= use[0];
						System.out.println("부족한 전력: " + result);
						i++;
				
					}
				}
					
			}
		
			
			public int startbuttonworking (int[] powerW) {
					int[] use = {330};
					int result;
					int i = 0;
					
							
						if(use[0] <= powerW[i]) {
								
							System.out.println("======-----스타트중-----======");
								result = powerW[i] -= use[0];
							System.out.println("사용전력 "+use[0]+"\t"+(i+1)+"번째 에 남은전력: " + result);
						
			
						}else{
							System.out.println("======-----전력부족-----======");
								result = powerW[i] -= use[0];
							System.out.println("부족한 전력: " +"\t"+(i+1)+"번째의 값 "+result);	
						
							System.out.println(result);
			
						}
				return  0;
			}
			
		
			
		
			
		
public static void main(String[] args) {

		int[] powerW = {400,300,300,1000};
	
				Computer computer = new Computer();
					computer.startbuttonworking(powerW);
					computer.mainboardpower(powerW);
					computer.moniter(powerW);
				}
	
		}
		
