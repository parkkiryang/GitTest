
public class Ex03 {
	public static void main(String[] args) { // jvm ȣ��

		// int �迭 1~100 ���� ���� �����ϰ� �Է¹޾Ƽ� ���� /��� ���ϱ�

		int sum = 0;
		double avg = 0;

		int[] nArr = new int[10];

		// �����Է�
		for (int i = 0; i < 10; i++) {
			nArr[i] = (int) (Math.random() * 99) + 1;
			sum += nArr[i];
		}

		// ����.��� ���
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (double) sum / nArr.length);

	}
}
