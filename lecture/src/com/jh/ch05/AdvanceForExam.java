package com.jh.ch05;

public class AdvanceForExam {

	public static void main(String[] args) {

		
		int[] Scores = {95,66,78,45,11};
		
		
		int sum =0;
		for(int Score : Scores) {
			sum = sum +Score;
		}
		
		System.out.println(" ������ : " + sum);
		
		double avg = (double) sum/Scores.length;
		System.out.println("������� :" + avg);
	}

}
