import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// ������ �迭 5�� ����
		// �ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���
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
