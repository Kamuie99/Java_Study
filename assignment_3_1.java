package study;

import java.util.*;
public class assignment_3_1 {

	public static void main(String[] args) {
		Scanner agescanner = new Scanner(System.in);
		int age = agescanner.nextInt();
		
		if (age >= 10 && age < 20) System.out.printf("귀하의 나이는 %d세이며, 10대입니다.",age);
		else if (age >= 20 && age <30) System.out.printf("귀하의 나이는 %d세이며, 20대입니다.", age);
		else if (age >= 30 && age <40) System.out.printf("귀하의 나이는 %d세이며, 30대입니다.", age);
		else if (age >= 40 && age <50) System.out.printf("귀하의 나이는 %d세이며, 40대입니다.", age);
		else if (age >= 50 && age <60) System.out.printf("귀하의 나이는 %d세이며, 50대입니다.", age);
		else if (age >= 60 && age <70) System.out.printf("귀하의 나이는 %d세이며, 60대입니다.", age);
		else System.out.printf("귀하의 나이는 %d세이며, 70세 이상입니다.",age);
		
		System.out.println();
	}

}
