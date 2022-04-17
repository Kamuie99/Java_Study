package study;

import java.util.*;
public class Study_220415_1 {

	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(100);
		
		System.out.println("정답 미리보기: " + answer);
		
		int input_number;
		int repeat_count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100까지의 숫자중 랜덤으로 선정된 숫자를 구하시오");
		
		do {
			System.out.println("정답: ");
			input_number = sc.nextInt();
			repeat_count++;
			if(input_number > answer) {
				System.out.println("더 낮습니다.");
			}
			if(input_number < answer) {
				System.out.println("더 높습니다.");
			}			
		}while (input_number != answer);
		
		System.out.printf("정답입니다. 총 시도 횟수는 %d입니다.", repeat_count);
	}

}
