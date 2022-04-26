package study;

import java.util.*;
public class Study_220426_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i=3; i<=num; i+=3) sum += i;
		
		System.out.printf("%d까지의 3배수 합은 %d입니다.", num, sum);
		
	}

}
