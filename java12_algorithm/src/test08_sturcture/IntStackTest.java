package test08_sturcture;

import java.util.Scanner;

public class IntStackTest {

	public IntStackTest() {
		
	}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(5); // new IntStack(10);
	    
	    while (true) {
	    	System.out.println("�������� �� : " + s.size() + ", ������ ũ�� : " + s.capacity());
	    	System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY (7)��������ǥ�� (8)REMOVE (9)HELP (0)���� = ");
	    	int menu = scan.nextInt();
	    	
	    	switch (menu) {
	    	case 0:
	    		System.out.println("���α׷��� �����մϴ�.");
	    		System.exit(0); //���α׷� ����
	    		break;
	    	case 1: //push
	    		System.out.print("������ �� : ");
	    		int data = scan.nextInt();
	    		try {
	    			s.push(data);
	    		} catch (IntStack.OverflowIntStackException oise) {
	    			System.out.println(oise.getMessage());
	    		}
	    		break;
	    	case 2: //pop
	    		try {
	    			int popData = s.pop(); //���� ���� �ִ°��� �����°��� pop�� ����
	    			System.out.println("������ �������� �ִ� �� : " + popData);
	    		} catch (IntStack.EmptyIntStackException eise) {
	    			System.out.println(eise.getMessage());
	    		}
	    		break;
	    	case 3: //peek
	    		try {
	    			int topData = s.peek();
	    			System.out.println("top -> " + topData);
	    		} catch (IntStack.EmptyIntStackException ese) {
	    			System.out.println(ese.getMessage());
	    		}
	    		break;
	    	case 4: //dump
	    		//������ ��� ���� [12,65,87] []
	    		String dumpData = s.dump();
	    		System.out.println("������ ��� ������ -> " + dumpData);
	    		break;
	    	case 5: //search : �����Ͱ� �ִ� index���� �����ش�. ������ -1
	    		System.out.print("ã�� �� �Է� : ");
	    		int searchData = scan.nextInt();
	    		int idx = s.indexOf(searchData);
	    		System.out.println(searchData + "��(��) " + idx + "�� ��ġ�� �ֽ��ϴ�.");
	    		break;
	    	case 6: //empty : ������ ��� ������ �����
	    		System.out.println("���ÿ� ����� ��� �����͸� �����Ͽ����ϴ�.");
	    		s.clear();
	    		break;
	    	case 7: //���� ���� ǥ��
	    		int size = s.size();
	    		int dataCnt = s.size();
	    		boolean empty = s.isEmpty();
	    		boolean full = s.isFull();
	    		
	    		System.out.println("���� ũ�� : " + size);
	    		System.out.println("������ �� : " + dataCnt);
	    		System.out.println("���� ������ ���" + ((empty) ? "�ֽ��ϴ�." : "���� �ʽ��ϴ�."));
	    		System.out.println("���� ������ ����" + ((full) ? "á���ϴ�." : "���� �ʾҽ��ϴ�."));	
	    		break;
	    	case 8: //����(��)
	    		System.out.print("������ ������ : ");
	    		int delData = scan.nextInt();
	    		
	    		boolean result = s.remove(delData);
	    		System.out.println(delData + "��(��) ����" + ((result)? "�Ǿ����ϴ�." : "���� ���Ͽ����ϴ�."));
	    		break;
	    	case 9: 
	    		System.out.println("1. ������ �ֱ�, 2. ������ ����, 3. �������� ���� ������ Ž��, 4. ������ ���� ������ Ȯ��");
	    		System.out.println("5. �������� ��ġ ã��, 6. ������ ��� ������ �����, 7. ������ ������ ǥ��, 8. ����");
	    		break;
	    	default:
	    		System.out.println("�޴��� �߸������Ͽ����ϴ�.");
	    	}
	    }
	}
}
