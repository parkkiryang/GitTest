import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 정수형 배열 5개 선언
		// 초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		int i=100;
		int result = sub(i);
		
		//int num = i;
	
	}

	public static int sub(int num) {
		
		int sum = 0;
		for(int i=0; i<=num; i++)
			sum +=i;
		System.out.println(sum);
		
		return sum;
			
	}

}
