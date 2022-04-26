package study;

import java.util.*;
public class Study_220426_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("숫자를 입력해 주세요: ");
		int Num_1 = sc.nextInt();
		
		int hol_sum = 0, zak_sum = 0, real_sum = 0;
		
		for(int i=1; i<=Num_1; i+=2) hol_sum += i;
		for(int j=2; j<=Num_1; j+=2) zak_sum += j;
		for(int k=1; k<=Num_1; k++) real_sum += k;
		
		System.out.println("홀수의 합 : " + hol_sum);
		System.out.println("짝수의 합 : " + zak_sum);
		System.out.printf("%d까지의 합: %d", Num_1, real_sum);
		
	}

}
