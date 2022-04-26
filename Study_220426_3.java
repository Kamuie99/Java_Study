package study;

import java.util.*;
public class Study_220426_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력 : ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
