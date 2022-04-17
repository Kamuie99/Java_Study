package study;

import java.util.*;
public class Study_220415_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택하시오");
		System.out.printf(" + \n - \n / \n * \n");
		String buho = sc.nextLine();
		
		
	switch(buho) {
	case"+":
		int a, b = 0;
		System.out.println("첫번째 값을 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		b = sc.nextInt();
		System.out.println(a + b);
		break;
	case"-":
		System.out.println("첫번째 값을 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		b = sc.nextInt();
		System.out.println(a - b);
		break;
	case"*":
		System.out.println("첫번째 값을 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		b = sc.nextInt();
		System.out.println(a * b);
		break;
	case"/":
		System.out.println("첫번째 값을 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		b = sc.nextInt();
		System.out.println(a / b);
		break;
	}

	}
}
