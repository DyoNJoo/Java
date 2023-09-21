package test08_sturcture;

import java.util.Scanner;

import test08_sturcture.IntQueue.QueueEmptyException;
import test08_sturcture.IntQueue.QueueOverFlowException;

public class IntQueueTest {
	Scanner scan = new Scanner(System.in);
	public IntQueueTest() {
		
	}
	public void queueStart() {
		IntQueue que = new IntQueue(5);
		
		while (true) {
			System.out.print("(1) ��ť, (2) ��ť, (3) ��ũ, (4) ����, (5) �����ͺ���, (6) indexOf, (7) ����, (0) ����? -> ");
			int m = scan.nextInt();
			
			switch (m) {
			case 0:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
				break;
			case 1: // enqueue : ť�� ������ �߰�
				//�߰��� �� �Է�
				System.out.print("�߰��� ������ �Է� -> ");
				int data = scan.nextInt();
				try {
					int r = que.enqueue(data);
				} catch (QueueOverFlowException qoe) {
					System.out.println(qoe.getMessage());
				}
				break;
			case 2: //dequeue : ť�� ������ ������
				try {
					int queueData = que.dequeue();
					System.out.println("���� ó�� ���� " + queueData);
				} catch (QueueEmptyException qee) {
					System.out.println(qee.getMessage());
				}
				break;
			case 3: //peek : ť�� ���� �� ������ �˾Ƴ���
				try {
					int queueData = que.peek();
					System.out.println("���� ó�� ���� " + queueData + "�Դϴ�.");
				} catch (QueueEmptyException qee) {
					System.out.print(qee.getMessage());
				}
				break;
			case 4: //dump : ť�� ���� �˾Ƴ���
				//ť�� �뷮
				System.out.println("ť�� �뷮 = " + que.capacity());
				//ť�� ������ ��
				System.out.println("ť�� ������ �� = " + que.size());
				//ť�� ����ִ���
				System.out.println("Empty : " + que.isEmpty());
				//ť�� ����á����
				System.out.println("Full : " + que.isFull());
				//ť�� ó��������
				System.out.println("ť�� ó�� �� : " + que.peek());
				//ť�� ������������
				System.out.println("ť�� ������ �� : " + que.peekLast());
				break;
			case 5: //������ ���� front -> rear������ ���� �������
				String result = que.getAllData();
				System.out.println("��ü ������ = " + result);
				break;
			case 6: //indexOf : �������� index���ϱ�
				System.out.print("ã�� �� �Է� = ");
				int searchData = scan.nextInt();
				int r = que.indexOf(searchData);
				System.out.println(searchData + "�� index�� " + r + "�Դϴ�.");
				break;
			case 7: //remove : �����ϱ�
				System.out.print("������ �� �Է� = ");
				int delData = scan.nextInt();
				int delResult = que.remove(delData);
				if (delResult == -1) {
					System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("�����͸� �����Ͽ����ϴ�.");
				}
				break;
			default:
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		new IntQueueTest().queueStart();
	}

}
