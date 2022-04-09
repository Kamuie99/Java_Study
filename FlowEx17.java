import java.util.*;
public class FlowEx17 {
	public static void main(String[] args) {
		int num = 0;
		System.out.print("*을 출력할 라인의 수를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		num += 1;
		
		for(int i=1; i<num; i++) {
			for(int j=num-1; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}
}
