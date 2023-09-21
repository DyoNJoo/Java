package test02_basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayScore {
	static int stuCount; //�л���
	static int subjectCount; //�����
	static String names[]; //�л��̸�
	static int stuScore[][]; //�л�����, ����, ���, ����, ���� ����, ���� ���
	// ���������� - ������ ������ ������ �迭�� ����
	static void setData() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test02_basic/sungjuk.txt")));
		
        stuCount = Integer.parseInt(br.readLine());
        subjectCount = Integer.parseInt(br.readLine());
        names = new String[10];
        stuScore = new int[stuCount + 2][subjectCount + 3];
        
        for (int i = 0; i < stuCount; i++) { // 0, 1, 2, 3, 4...9
            String data[] = br.readLine().split(","); // 1�� �б�
            names[i] = data[0];
            
            for (int j = 0; j < subjectCount; j++) { // 0, 1, 2
                stuScore[i][j] = Integer.parseInt(data[j + 1]);
            }
        }
        br.close();
	}
	
	static void process() {
		for (int r = 0; r < stuCount; r++) { //��
			for (int c = 0; c < subjectCount; c++) { //��
				stuScore[r][subjectCount] += stuScore[r][c];//���κ�����
				stuScore[stuCount][c] += stuScore[r][c];//��������
			}
			//���κ� ���
			stuScore[r][subjectCount + 1] = stuScore[r][subjectCount] / subjectCount;
		}
		//�������
		for (int c = 0; c < subjectCount; c++) {
			stuScore[stuCount + 1][c] = stuScore[stuCount][c] / stuCount;
		}
		scoreRank();		
	}
	
	static void scoreRank() {
		for (int i = 0; i < stuCount; i++) { //0, 1, ... 9
			for (int j = 0; j < stuCount; j++) { //0, 1, ... 9
				if (stuScore[i][subjectCount] < stuScore[j][subjectCount]) {
					stuScore[i][subjectCount + 2]++;
				}
			}
			stuScore[i][subjectCount + 2]++;
		}
	}
	
	static void print() {
		for (int i = 0; i < stuCount; i++) {
			//�̸�
			System.out.print(names[i] + " ");
			for (int j = 0; j < stuScore[i].length; j++) {
				System.out.printf("%d ", stuScore[i][j]);
			}
			System.out.println();
		}
		//��������
		System.out.printf("�������� ");
		for (int j = 0; j < stuScore[0].length; j++) {
			System.out.print(stuScore[stuCount][j] + " ");
		}
		//�������
		System.out.printf("������� ");
		for (int j = 0; j < stuScore[0].length; j++) {
			System.out.print(stuScore[stuCount + 1][j] + " ");
		}
	}
	public static void main(String[] args) {
		try {
			//������ ������ ������ �迭�� ����
			setData();
			//ó��
			process();
			//���
			print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
