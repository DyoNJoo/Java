import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1~1000사이의 난수 200개 생성하여 배열 저장하고
		// 난수의 총합, 평균, 최대값, 최소값을 구하여 출력.
		Random random = new Random();
		int randomArray[] = new int[200]; //200개를 저장하기 위해 배열을 200개 생성함.
		int sum = 0;
		double avg = 0;
		
		int max = Integer.MIN_VALUE; //최댓값 초기화
		int min = Integer.MAX_VALUE; //최소값 초기화
		
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
		
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

}
