package study;

import java.util.*;
public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("빛의 속도는 1초에 약 300,000km를 갈 수 있는 속도라고 합니다.");
		System.out.printf("몇 년을 달릴 지 입력해 주세요: ");
		int years = sc.nextInt();
		
		for (int i=1; i<=years; i++) {
			System.out.printf("%d년으로는  %d km를 갈 수 있습니다.", i, i * 300000);
			System.out.println();
		}
		System.out.println();
		
		
	}

}
