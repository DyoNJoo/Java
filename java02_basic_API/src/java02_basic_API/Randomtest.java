package java02_basic_API;

import java.util.*;

public class Randomtest {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
//			boolean boo = random.nextBoolean();
//			System.out.print(boo+"\t");
			
//			double dbl = random.nextDouble();
//			System.out.print(dbl+"\t");
			//12~42������ ���� ������ ���ϱ�
			//1~6
			//random.nextInt(6) + 1;
			//ū��-������+1
			int ranInt = random.nextInt(100) + 1;
			System.out.print(ranInt+"\t");
			
			if (i % 10 == 0) System.out.println();
		}
		
	}

}
