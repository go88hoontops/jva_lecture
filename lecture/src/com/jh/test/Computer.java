		package com.jh.test;
		
		public class Computer {
			
			
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
			
			
			
			public void moniter (int[] powergetboard) {
				
				int[] use = {140};
				int result;
				
				for(int i=0; i < powergetboard.length; i++) {
					if(use[0] < powergetboard[i]) {
						result = powergetboard[i] -= use[0];
						System.out.println("�������"+use[0]+"����� ���°���..."+"���·�"+ result);
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
						System.out.println("�������"+use[0]+"���κ��� ���°���..."+"���·�"+ result);
					
						break;
					}else {
						System.out.println("======-----���κ����Ŀ� ���º���-----======");
						result = powerget[i] -= use[0];
						System.out.println("������ ����: " + result);
						i++;
				
					}
				}
					
			}
		
			
			public int startbuttonworking (int[] powerW) {
					int[] use = {330};
					int result;
					int i = 0;
					
							
						if(use[0] <= powerW[i]) {
								
							System.out.println("======-----��ŸƮ��-----======");
								result = powerW[i] -= use[0];
							System.out.println("������� "+use[0]+"\t"+(i+1)+"��° �� ��������: " + result);
						
			
						}else{
							System.out.println("======-----���º���-----======");
								result = powerW[i] -= use[0];
							System.out.println("������ ����: " +"\t"+(i+1)+"��°�� �� "+result);	
						
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
		
