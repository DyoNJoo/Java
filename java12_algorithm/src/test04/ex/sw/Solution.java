package test04.ex.sw;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		 // ������ ��������
		try {
			System.setIn(new FileInputStream("src/test03/ex/sw/input1204.txt"));
			
			Scanner s = new Scanner(System.in);
			int cnt = s.nextInt(); // ������
			
			for (int i = 1; i <= cnt; i++) { // ������ ��ŭ �ݺ�
				int num = s.nextInt();//������ȣ
				int numCnt[] = new int[101];//���� ���� ���� �迭
				
				for (int j = 1; j <= 1000; j++) { //õ�� �ݺ�
					numCnt[s.nextInt()]++;
				}
				//System.out.println(Arrays.toString(numCnt));
				//�ֺ��
				int maxIdx = 0; //���� ū ���� �ִ� index
				for (int c = 1; c < numCnt.length; c++) { // c = index
					if (numCnt[maxIdx] <= numCnt[c]) {
						maxIdx = c;
					}
				}
				System.out.printf("#%d %d\n", num, maxIdx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
