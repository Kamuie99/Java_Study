package study;

import java.util.*;

public class Study_220415 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", N, i, N * i);
		}
	}

}
