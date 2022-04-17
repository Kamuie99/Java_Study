package study;

import java.util.*;

public class Taedong_Assignment {

	public static void main(String[] args) {
		
		int[][]score = {
					{ 100, 88, 100, 100}
					, { 90, 95, 90, 90}
					, { 80, 85, 80, 80}
					, { 70, 75, 70, 70}
					};
		System.out.println("이름 국어 영어 수학  총점   평균  등수");
		System.out.println("==========================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
				System.out.printf("%5d", score[i][j]);
			int []personal_total = new int[5];
			personal_total[i] = sum;
			}
			avg = sum / (float)score[i].length;
			System.out.printf("%6.1f%n", avg);
		}
	
		
		
		
		
	}

}
