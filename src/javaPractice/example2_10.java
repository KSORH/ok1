
package javaPractice;

import java.util.Scanner;

public class example2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력값 받기
		Scanner scanner = new Scanner(System.in);

		// 출력
		System.out.print("점수를 입력하시오 : ");
		// 입력받은 값을 score 담기
		int score = scanner.nextInt();
		// 조건문
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다!");

		// scanner 닫기 (굳이 적지 않아도 된다)
		scanner.close();

	}
}
