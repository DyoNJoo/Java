
public class Array01 {

	public static void main(String[] args) {
		//�迭������ ���� - ���� ������ Ÿ�� ������ ���� �� �ʿ��� ��
		
		int num = 10;
		
		int[] dataInt; //null
		int numArr[]; //null
		numArr = new int[10];
		
		String name[] = new String[5];
		
		numArr[1] = 90;
		System.out.println("numArr[1] = " + numArr[1]);
		
		for (int idx = 0; idx < numArr.length; idx++) {
			System.out.printf("numArr[%d] = %d\n", idx, numArr[idx]);
		}
		
		name[1] = "ȫ�浿";
		name[3] = "�̼���";
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("name[%d] = %s\n", i, name[i]);
		}
	}

}
