package java07_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack : ���� �Է��� ��ü�� ���߿� ��µȴ�. (FILO, LIFO)
		Stack stack = new Stack();
		
		//��ü �߰� �޼ҵ�
		stack.push("ȫ�浿");
		stack.push("��浿");
		stack.push("�ֱ浿");
		stack.push("���浿");
		
		//��ü ������
		while(!stack.empty()) {
			String popData = (String)stack.pop();
			System.out.println(popData);
		}
}

	public static void main(String[] args) {
		new StackTest();
	}

}
