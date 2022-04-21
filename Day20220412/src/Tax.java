import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		{
			//갯수를 얻기 위한 코드를 여기다가 작성한다.
			File SrcFile = new File("res/covid.txt");
			FileInputStream srcFis = new FileInputStream(SrcFile);
			Scanner fscan = new Scanner(srcFis);
			
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			count--;
			fscan.close();
			srcFis.close();
		}
		
		System.out.println(count);
		
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirms = new int[count];
		{
			File SrcFile = new File("res/covid.txt");
			FileInputStream srcFis = new FileInputStream(SrcFile);
			Scanner fscan = new Scanner(srcFis);
	//		Scanner fscan = new Scanner(srcFis, "utf-8"); //한글이 깨지면
			
			fscan.nextLine();
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] tokens = line.split(",");
				cities[i] = tokens[0];
				dates[i] = tokens[1];
				confirms[i] = Integer.parseInt(tokens[2]);
			}
			//System.out.println(line);
	//		System.out.println(Arrays.toString(tokens));
	//		System.out.println(tokens[0]);
			fscan.close();
			srcFis.close();
		}
		for(int i=0; i<count; i++) {
			System.out.printf("%s ", cities[i]);
			if( i % 10 == 0 ) System.out.println();
		}
		
		
	}

}
