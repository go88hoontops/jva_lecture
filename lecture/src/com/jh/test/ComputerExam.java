			package com.jh.test;
		
		public class ComputerExam {
			
			String brand ="������ǻ��";
			String startbutton;
			String moniter;
			String mobiterBrand;
			String mainBoard;
			String mainBoardBrand;
			String cpu;
			String gpu;
			String others;
			
			
		
			public int[] power () {
			//�Ŀ� ����� 500¥�� 5ĭ	
				int[]result = new int[5];
				
				for(int i = 0 ; i < result.length;i++) {
					result[i] += 500;
					System.out.println(result[i]);
				}
					
				return result;
			}
			
			
			
//			
//			final static int[] process (int[] getpowers) {
//				
//				int[] result = new int[2];
//				
//				
//						
//				
//				
//				
//			}
			
		
			
			public void mainboardpower (int[] powergetboard) {
				
				int[] use = {100};
				int result;
				
				for(int i=0; i < powergetboard.length; i++) {
					if(use[0] < powergetboard[i]) {
						result = powergetboard[i] -= use[0];
						System.out.println("���κ��� ���°�����..."+ result);
						break;
					}else {
						
					}
				}
					
			}
			
			public int startbuttonworking (int[] powerget) {
					int[] buttonpress = {330};
					int result;
					
					for(int i= 0; i < powerget.length; i++) {
						
						if(buttonpress[0] < powerget[i]) {
								
							System.out.println("======-----��ŸƮ��ư ����-----======");
							System.out.println("======-----...........-----======");
							
							 result = powerget[i] -= buttonpress[0];
							System.out.println("��������: " + result);
						
							break;
						}else {
							System.out.println("======-----.....-----======");
							System.out.println("======-----���º���-----======");
							System.out.println("======-----.....-----======");
							
							result = powerget[i] -= buttonpress[0];
							
							System.out.println("������ ����: " + result);	
						}	
							System.out.println(result);
					}
		// ���·��� ���ϰ����� �ְ������ .. 
					
				return  0; 
			
			}
		} 
		
		
			
		
			
		