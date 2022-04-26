package study;

import java.util.*;
public class Study_220426_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("최대로 나올 숫자를 입력해 주세요 : ");
		int max_num = sc.nextInt();
		
		double the_num = Math.random() * max_num;
		
		int try_num = 1;
		
		while (true) {
			System.out.printf("입력 : ");
			int ex_num = sc.nextInt();
		
			if (ex_num < (int)the_num) {
				System.out.println("입력한 값이 정답보다 작습니다!");
				try_num += 1;
			}else if (ex_num > (int)the_num) {
				System.out.println("입력한 값이 정답보다 큽니다!");
				try_num += 1;
			}else if (ex_num == (int)the_num ) {
				System.out.println("축하합니다 정답입니다!");
				System.out.printf("%d번 만에 맞추셨습니다!", try_num);
				break;
			}
		}
		
	}

}
