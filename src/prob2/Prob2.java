package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		
		int price = 0;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};	// 단위 담는 배열
		int[] unitsCount = new int[10];	// 단위 당 개수 배열
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		price = scanner.nextInt();
		
		for(int i=0; i<units.length; i++) {
			if(price >= units[i]) {		// 단위보다 가격이 크면
				unitsCount[i] = price/units[i];		// 단위 개수만큼 배열에 추가
				price -= units[i] * unitsCount[i];	// 뺀만큼 가격에서 차감
			}
		}
		
		for(int j=0; j<units.length; j++) {
			System.out.print(units[j] + "원 : " + unitsCount[j] + "개");
			System.out.println();
		}
		
	}
}

