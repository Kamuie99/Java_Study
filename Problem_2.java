package study;

import java.util.*;
public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int new_sec = sc.nextInt();
		int min = 0, hour = 0, sec = 0;
		
		if (new_sec >= 60 && new_sec < 3600) {
			min = new_sec / 60;
			sec = new_sec % 60;
			System.out.printf("%d초는 %d시 %d분 %d초 입니다.", new_sec, hour, min, sec);

		}else if (new_sec >= 3600) {
			hour = new_sec / 3600;
			min = (new_sec - 3600) / 60;
			sec = new_sec % 60;
			System.out.printf("%d초는 %d시 %d분 %d초 입니다.", new_sec, hour, min, sec);

		}else {
			System.out.printf("%d초는 %d시 %d분 %d초 입니다.", new_sec, hour, min, new_sec);
		}
	}

}
