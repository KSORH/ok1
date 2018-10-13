package javaPractice;

public class example3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum이라는 변수에 0으로 초기화
		int sum = 0;
		
		// i는 1부터 시작 10이하일때까지 1씩 증가시키며 반복 
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
