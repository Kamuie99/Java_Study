package study;

public class assignment_3 {

	public static void main(String[] args) {
		int money = 10000;
		int price = 5724;
		int change = money - price;
		int change_1000 = change /1000;
		int change_500 = change % 1000 /500;
		int change_100 = change % 500 /100;
		int change_10 = change % 100 / 10;
		int change_01 = change % 10;
		
		System.out.println("소지금: " + money);
		System.out.println("판매가격: " + price);
		System.out.println("거스름돈: " + change);
		System.out.println("1000원: " + change_1000);
		System.out.println("500원: " + change_500);
		System.out.println("100원: " + change_100);
		System.out.println("10원: " + change_10);
		System.out.println("1원: " + change_01);
		
	}

}
