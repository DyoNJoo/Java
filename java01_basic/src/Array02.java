
public class Array02 {

	public static void main(String[] args) {
		//�迭�����ϱ�
		//�ʱⰪ�� �ִ� �迭�� �����ϱ�
		
		int num[] = { 13, 24, 53, 26, 34, 74 };
		
		int data[] = new int[] { 66, 45, 32, 42, 52, 61 };
		String[] colorName = new String[] { "red", "blue", "green", "yellow", "pink", "orange" };
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%2d -> %2d, %d, %s\n", i, num[i], data[i], colorName[i]);
		}
		
	}

}
