
package javaPractice;

import java.util.Scanner;

public class example2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Է°� �ޱ�
		Scanner scanner = new Scanner(System.in);

		// ���
		System.out.print("������ �Է��Ͻÿ� : ");
		// �Է¹��� ���� score ���
		int score = scanner.nextInt();
		// ���ǹ�
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�!");

		// scanner �ݱ� (���� ���� �ʾƵ� �ȴ�)
		scanner.close();

	}
}
