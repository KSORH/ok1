package javaPractice;

public class example3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum�̶�� ������ 0���� �ʱ�ȭ
		int sum = 0;
		
		// i�� 1���� ���� 10�����϶����� 1�� ������Ű�� �ݺ� 
		for(int i = 1; i<=10; i++) {
			sum += i; 
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
			
		}
	}

}
