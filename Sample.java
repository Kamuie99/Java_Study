package study;

import java.util.Scanner;
public class Sample	{
	public static void main(String []args)	{
		String subject[]= {"국어", "영어", "수학"};
		String name[]=new String[5];        // 이름 배열 5 길이로 생
		int point[][]=new int [5][5];		// 점수 배열 
		float[] avg = new float[5];
		int[] rank = new int[5];
		int count = 0 ;
		Scanner sc = new Scanner(System.in);
		
		String name_2 = sc.nextLine();
		name = name_2.split(" ");
		
		for(int i=0; i<subject.length; i++) {
			System.out.printf("%s 점수를 입력해주세요", name[i]);
			
			for(int j=0; j<subject.length; j++) {
				point[i][j] = sc.nextInt();
				avg[i] += point[i][j];
			}
			avg[i] /= subject.length;

		}
		
		for(int i = 0; i < avg.length; i ++) {
			for( int j = 0; j <= avg.length-2; j++) {
				if(avg[i] < avg[j+1]) {
					count++;
				}
				rank[i] = count;
				count = 0;
				}
		}
		System.out.println("이름 국어 영어 수학 평균 등수");
		System.out.println("======================");
		
		
		
	    for(int i=0; i<subject.length;i++) {
	    	System.out.print(name[i] + "  ");
			for(int j=0; j<subject.length;j++) {
				System.out.print(point[i][j]+ " ");			// 점수 출력문 있는 
			}
			System.out.printf("%6.1f\n", avg[i]);
			
		}
	    
	   
		
	}
}
