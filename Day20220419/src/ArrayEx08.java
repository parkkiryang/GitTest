
public class ArrayEx08 {

	public static void main(String[] args) {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1;

		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) { //i = 5
			j = (int) (Math.random() * ball.length);
			temp = ball[i];  //1
			ball[i] = ball[j];  //b[0] = b[30]
			ball[j] = temp;   //b[31] = temp
		}

		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}
