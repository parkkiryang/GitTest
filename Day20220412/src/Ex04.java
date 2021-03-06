import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException, InterruptedException {

		int count=0;
		{
			File SrcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(SrcFile);
			Scanner fscan = new Scanner(srcFis);
		
			while(fscan.hasNext()) {
				fscan.next();
				count++;
			}
			fscan.close();
			srcFis.close();
		}

		
		int[] nums = new int[count];
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFile);
		
			for(int i=0; i<count; i++){
				String temp = fscan.next();
				nums[i] = Integer.parseInt(temp);
			}
			fscan.close();
			srcFis.close();
		}

		for(int i=0; i<count; i++)
			System.out.printf("%d ",nums[i]);
	
		System.out.println("\n -----------------------------");
	
		//배열에서 특정 데이터를 찾는 능력
		int index = -1;
		{
			//반복적으로 돌면서 찾아보자........
			for(int i=0; i<count-1; i++)
				if(88 == nums[i]) {
					index = i;
					break;
				}
		}
		System.out.printf("index : %d\n",index);

		//배열에서 위치를 바꾸거나 값을 변경하는 능력
		//이전 상태   --> 첫번째 변수와 다섯번째 변수를 교환하시요.
		for(int i=0; i<count; i++)
			System.out.print(nums[i] + " ,");
		System.out.println();
		//변경 상태
		{
			
			int tmp = nums[0];
			nums[0] = nums[4];
			nums[4] = tmp;
		}
		for(int i=0; i<count; i++)
			System.out.print(nums[i] + " ,");
		System.out.println("\n---------------------------------");
	
		//위의 연산은 0과 4 위치의 값을 바뀌는 것이었다.
		//이번에는 반복적으로 i <==> i+1 위치값을 바꾸는 예제로 변경해보자. 반복횟수는 count-1로 한다.
		//실행된 출력 결과는 0번째 값이 제일 뒤로 밀려난 상태여야 한다.
		for(int i=0; i<count-1; i++) {
			int tmp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = tmp;
			
		}
		for(int i=0; i<count; i++)
			System.out.print(nums[i] + " ,");
		System.out.println("\n------------------------------");
	
		// 위 프로그램을 1차 Upgrade.....	
		for(int i=0; i<count-1; i++) {
			if(nums[i]>nums[i+1]) { //1회전때는 생략
				int tmp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = tmp;
			}
			
			Thread.sleep(1000);
			//화면 밀어 내기..-> 처음은 기입하지말고 실행
			for(int j = 0; j<30; j++)
				System.out.println();
			
			for(int j=0; j<count; j++)
				if(j == i+1 || j==i)
					System.out.printf("[%d] ", nums[j]);
				else
					System.out.printf("%d ", nums[j]);
			//System.out.println("\n---------------------------------");
		}
		
		//정렬(평균, 중앙값[정렬될 데이터의 가운데 값], 최대값, 최소값...)
		
	}
}
