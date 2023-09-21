import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1~1000������ ���� 200�� �����Ͽ� �迭 �����ϰ�
		// ������ ����, ���, �ִ밪, �ּҰ��� ���Ͽ� ���.
		Random random = new Random();
		int randomArray[] = new int[200]; //200���� �����ϱ� ���� �迭�� 200�� ������.
		int sum = 0;
		double avg = 0;
		
		int max = Integer.MIN_VALUE; //�ִ� �ʱ�ȭ
		int min = Integer.MAX_VALUE; //�ּҰ� �ʱ�ȭ
		
		for (int i = 0; i < randomArray.length; i++) {
			// randomArray[i] = (int)(Math.random() * (1000-1+1)) + 1;
			randomArray[i] = random.nextInt(1000) + 1;
			sum += randomArray[i];
			
			if (max < randomArray[i]) {
				max = randomArray[i];
			}
			if (min > randomArray[i]) {
				min = randomArray[i];
			}
			
			//max = Math.max(max, randomArray[i]);
			//min = Math.min(min, randomArray[i]);
		}
		
		avg = (double) sum / randomArray.length;
		
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}

}
