import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//원본배열			0	1	2	3	4
		int arrOrg[] = {25, 76, 45, 91, 12};
		//타겟배열
		int arrTag[] = new int[10];// 3, 4, 5
		
		System.arraycopy(arrOrg, 2, arrTag, 3, 3);
		
		for (int i = 0; i < arrTag.length; i++) {
			System.out.println("arrTag["+i+"]="+ arrTag[i]);
		}
		
		System.out.println(Arrays.toString(arrTag));
	}

}
