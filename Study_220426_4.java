package study;

import java.util.*;
public class Study_220426_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력 : ");
		int new_num = sc.nextInt();
		int num = 1, tmp = 0;
		
		for (int i=0; i<new_num; i++) {
			for (int j=0; j<new_num; j++) {
				if (i % 2==1 && i != 0) {
					tmp = new_num * (i+1) - j;
					System.out.printf("%3d", tmp);
				}else {
					System.out.printf("%3d", num);
				}
				num += 1;
			}
			System.out.println();
		}
		
		
	}

}
