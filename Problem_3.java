package study;

import java.util.*;
public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("현재 가진 금액을 정수로 입력해주세요: ");
		int cash = sc.nextInt();
		
		System.out.printf("구매하고자 하는 상품의 가격을 입력해주세요: ");
		int price = sc.nextInt();
		
		System.out.printf("%d원으로 %d원짜리 상품 %d개를 구입할 수 있고 잔돈은 %d원 입니다. ", 
				cash, price, cash/price, cash%price);
		
	}

}
