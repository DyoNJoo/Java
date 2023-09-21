package test05.ex.backjoon;

import java.util.Scanner;

public class Baekjoon_1244 {

	public Baekjoon_1244() {
		// TODO �ڵ� ������ ������ ����
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//����ġ ����
		int switchCount = s.nextInt();
		int switches[] = new int[switchCount]; // ����ġ�� ������ŭ �迭�� �����Ѵ�.
		
		//����ġ�� ���� �Է�
		for (int i = 0; i < switchCount; i++) {
			switches[i] = s.nextInt();
		}
		
		//�л� ��
		int stuCount = s.nextInt();
		
		//�л��� ������ �ް� ����ġ ����
		for (int i = 0; i < stuCount; i++) {
			int gender = s.nextInt(); //�л��� ���� 
			int switchNum = s.nextInt(); //�л��� �ο����� ����ġ�� ��ȣ
			
			if (gender == 1) { //���л��� ���
				for (int j = switchNum - 1; j < switchCount; j += switchNum) {
					switches[j] = 1 - switches[j];
				}
			} else if (gender == 2) { //���л��� ���
				switchNum--;
				int left = switchNum;
				int right = switchNum;
				//�¿��Ī
					
				while (left >= 0 && right < switchCount && switches[left] == switches[right]) {
					switches[left] = 1 - switches[left];
					switches[right] = 1 - switches[right];
					left--;
					right++;
				}
			}
		}
		
		//���
		for (int i = 0; i < switchCount; i++) {
			System.out.print(switches[i] + " ");
		}
	}

}
