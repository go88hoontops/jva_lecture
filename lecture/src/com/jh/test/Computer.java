		package com.jh.test;


public class Computer {
			//21-01-07 ������
			//�������
			//��ǥ�� power �Լ������� ��ǻ�͸� Ű�� �������� ���
			//cpuz�� �ʵ忡 �ִ»������� ���
			//���ǿ� ���� ������ ()<�� ���� �־����.
			
	String brand ="������ǻ��";
	String startbutton;
	String moniterModel;
	String moniterBrand  = "Dell";
	String mainBoard ;
	String mainBoardBrand ="MSI";
	String cpu;
	String cpuBrand = "intel";
	String gpu;

		
	String cpuz;
			
	public class print{
		
	}
			Computer(){
				
			}
			
			Computer(String mainBoardBrand){
				this.mainBoardBrand = mainBoardBrand;
			}
			
			Computer(String mainBoard, String cpu){
				this.mainBoard = mainBoard;
				this.cpu = cpu;
			}
			
			
			
		
			public int[] power () {
				//�Ŀ� ����� 500¥�� 5ĭ	
					int[]result = new int[5];
					
					for(int i = 0 ; i < result.length;i++) {
						result[i] += 500;
						System.out.println(result[i]);
					}
						
					return result;
			}
							//�ش� �޼ҵ�� �Ŀ����� ��Ÿ���� ����Ϸ��� �޴µ� 
			
			
			public void moniter (int[] powerW) {
				
				int[] use = {140};
				int result;
				
				for(int i=0; i < powerW.length; i++) {
					System.out.println("����ͷ� �Ѿ�� ���� " + powerW[i]+"�Ŀ���");
					if(use[0] < powerW[i]) {
						result = powerW[i] -= use[0];
						System.out.println("������� "+use[0]+"����Ϳ� ��� �� ���·� :"+ result);
						
						break;


					}else {
						System.out.println("======----�Ŀ�����----======");
						result = powerW[i] -= use[0];
						System.out.println("������ ����: " + result);
						System.out.println("�����Ŀ��� �����");
						
					}
				}
					
			}
			
			
			public void mainboardpower (int[] powerW) {
				
				int[] use = {100};
				int result,result2;
			
				for(int i=0; i < powerW.length; i++) {
					System.out.println("���κ���� �Ѿ�� ���� " + powerW[i]+"�Ŀ���");
					if(use[0] < powerW[i]) {
						result = powerW[i] -= use[0];
						System.out.println("���κ��� ��������");
						System.out.println("������� "+use[0]+"���κ��忡 ��� �� ���·� :"+ result);
					
						break;
					}else {
						System.out.println("======----�Ŀ�����----======");
						result = powerW[i];
						result2 = powerW[i] -= use[0];
						System.out.println("������ ����: " + result);
						System.out.println("�����Ŀ��� �����");
					
					}
				}
					
			}
		
			
			public int startbuttonworking (int[] powerW) {
					int[] use = {330};
					int result,result2 = 0;
					int i = 0;
			if(use[0] < powerW[i]) {
				System.out.println( powerW[i]+"�Ŀ���");
							System.out.println("======-��ŸƮ��ư=====");
							System.out.println(powerW[i]+"���� �Ŀ���");
								result = powerW[i] -= use[0];
						
						System.out.println("��������");
						System.out.println("������� "+use[0]+"\t"+" ��������: " + result);
			
				}else{
					result2 = powerW[i] -= use[0];
							System.out.println("======-----���º���-----======");
							System.out.println("������ ����: " +"\t"+result2);	
						
							System.out.println(result2);
			
						}
				return  result2;
			}
		
		
public static void main(String[] args) {

		int[] powerW = {400,300,300,1000};
				
	
				Computer computer = new Computer();
				Computer computer2 = new Computer("z390","9900k");
				
					computer.startbuttonworking(powerW);
					
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("�Ŀ��� i���� �ܷ� = "+ powerW[i]);
					}
					
					
					computer.mainboardpower(powerW);
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("�Ŀ��� i���� �ܷ� = "+ powerW[i]);
					}
					
					computer.moniter(powerW);
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("�Ŀ��� i���� �ܷ� = "+ powerW[i]);
					}
					
					
					
					
					
					
					System.out.println("=============��������==============");
					System.out.println("=============cpuz�� ��ǻ�� üũ=====");
			
					System.out.println(computer2.mainBoardBrand);
					System.out.println(computer2.mainBoard);
					System.out.println(computer2.cpu);
				
					
				}
	
		}
		
