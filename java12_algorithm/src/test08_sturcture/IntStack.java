package test08_sturcture;

public class IntStack {
	//�迭�� �̿��Ͽ� ���ñ���� �����͸� �����Ѵ�.
	int stack[]; //ó���� null
	//������ ũ��
	int max;
	//������ ������ - ���ÿ� ���� �� �ִ� ��ġ���� ������.
	int pointer;
	
	//ũ�⸦ �������� ���� ��� 20���� �����͸� ���� �� �ֵ��� �迭�� �����Ѵ�.
	public IntStack() {
		this(20);
	}
	
	//capacityũ�� ��ŭ �迭�� �����Ѵ�.
	public IntStack(int capacity) {
		try {
			stack = new int[capacity];
			max = capacity;
			pointer = 0;
		} catch (OutOfMemoryError oome) {
			max = 0; //������ ũ��
		}
	}
	//---------------------------------------------------------------
	//-- �������� ��
	public int size() {
		return pointer;
	}
	
	//-- ������ ũ��
	public int capacity() {
		return max;
	}
	public int push(int data) {
		//�̹� stack�� ���� á���� Ȯ���� ��, ���ܸ� �߻���Ŵ
		if (max <= pointer) {
			throw new OverflowIntStackException();
		}
		return stack[pointer++] = data;
		//�����Ͱ� ä������ ���, pointer�� 1�� �����Ѵ�.
	}
	public int pop() {
		//������ ����ִ� ��� pointer <= 0
		if (pointer <= 0) {
			throw new EmptyIntStackException();
		}
		return stack[--pointer];
	}
	//�������� ���� ������ - ���� ���� �ִ� ��
	public int peek() {
		if (pointer == 0) {
			throw new EmptyIntStackException();
		}
		return stack[pointer-1];
	}
	public String dump() {
		// pointer-1
		// [12,65,87] []
		String stackData = "[";
		for (int i = pointer-1; i >= 0; i--) { //2, 1, 0
			stackData += stack[i];
			if (i > 0) stackData += ", ";
		}
		stackData += "]";
		return stackData;
	}
	public void clear() {
		pointer = 0;
	}
	// ã���� �ϴ� ���� index���ϱ�
	public int indexOf(int data) {
		for (int i = pointer-1; i >= 0; i--) {
			if (stack[i] == data) {
				return i;
			}
		}
		return -1; //���ÿ� ���� ���� ��
	}
	
	public boolean isEmpty() {
		if (pointer == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (max == pointer) {
			return true;
		} else {
			return false;
		}
	}
	//������ ���� = true
	//������ ���� X = false
	public boolean remove(int data) {
		if (isEmpty()) return false;
		
		//���ÿ� ���� ������ ���� �� ���� ������
		int idx = indexOf(data);
		if (idx == -1) return false;
		pointer--;
		for (int i = idx; i < pointer; i++) { //1, 2, 3, 4
			stack[i] = stack[i + 1];
		}
		return true;
	}
	//---------------------------------------------------------------
	//���� �� ���� : ������ ���� ��
	//�����Ͱ� ��ĥ�� �߻���ų ����Ŭ����
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			super("�����÷ΰ� �߻��Ͽ����ϴ�.");
		}
	}
	
	//���� �� ���� : ������ ��� ����
	//�����Ͱ� ������ �߻���ų ����Ŭ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			super("������ ��� �ֽ��ϴ�.");
		}
	}
}
