package java02_basic_API;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int data[] = { 23, 65, 79, 41, 31, 32, 46, 56 };
		System.out.println("���� �� -> " + Arrays.toString(data));
		
		//����
		Arrays.sort(data); //������������ ���ĵ�.
		System.out.println("���� �� -> " + Arrays.toString(data));
		
		
		//�迭�� �Ϻΰ��� �����ϱ�
		//				0	1	2	3	4	5	6	7
		int data2[] = { 52, 23, 12, 56, 34, 88, 94, 25 };
		System.out.println("���� �� -> " + Arrays.toString(data2));
		
		//sort(int[] a, int fromIndex, int toIndex(�ձ��� ����))
		Arrays.sort(data2, 2, 5);
		System.out.println("���� �� -> " + Arrays.toString(data2));
		
		//�������迭�� ���� "2", "ȫ", "A"
		String data3[] = {"red", "orange", "apple", "banana"};
		Arrays.sort(data3);
		System.out.println("data3 -> " + Arrays.toString(data3));
		
		//������������ ���� (���� ������)
		Arrays.sort(data3, Collections.reverseOrder());
		System.out.println("data3 -> " + Arrays.toString(data3));
		
		//�迭����
		int data4[] = Arrays.copyOfRange(data2, 3, 7); //data2�� index 3���� index 7�ձ���
		System.out.println("copy -> " + Arrays.toString(data4));
	}

}
