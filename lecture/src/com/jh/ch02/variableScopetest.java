/**
 * 
 */
package com.jh.ch02;

/**
 * @author admin
 *
 */
public class variableScopetest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			int v1 = 15;
			int v2 = 0;
			if (v1>v2) {
				
				System.out.println("v1 �� v2 ���� ũ��");
			}else {
				System.out.println("v1 �� v2 ���� �۴�");
			}
			
		//	int v3 = v1 + v2 + 5;
	
	}
      // ����  v2 ������ IF ���ӿ����� ����Ǿ���, 24��°�ٿ� ������ ������   v2 ������ ���� �޼ҵ忡 ���ٴ°�.
	//�׷��Ƿ� v3������ �������� �����Ҽ�����.
}