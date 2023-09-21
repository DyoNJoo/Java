package test08_sturcture;

public class IntQueue {
	//�����͸� ���� �迭
	private int queue[];
	
	private int front; //����(��ť)��ġ
	private int rear; //����(��ť)��ġ
	
	private int max; //ť�� ũ�� : �뷮
	private int count; //������ ��
		
	public IntQueue() {
		this(10);
	}
	public IntQueue(int capacity) {
		max = capacity;
		front = rear = count = 0;
		try {
			//ť ����(�迭)
			queue = new int[capacity];
		} catch (OutOfMemoryError oome) {
			System.out.println("�޸𸮰� �����մϴ�.");
		}
	}
	public int enqueue(int data) {
		//ť�� ����á�� ��
		if (max == count) {
			throw new QueueOverFlowException();
		}
		
		//ť�� ������ ���� ��
		//���� rear�� ��ġ�� ���� �߰� �ϰ� rear�� 1���� ��Ų��.
		queue[rear++] = data;
		
		//�������� �� ����
		count++;
		
		//rear�� �迭�� ������ �̵������� 0���� index�� ����
		if (max == rear) rear = 0;
		return data;
	}
	public int dequeue() {
		//ť�� ����ִ� �� Ȯ��
		if (count == 0) {
			throw new QueueEmptyException();
		}
		
		//front��ġ�� ���� �����ְ�, front�� 1����
		int frontData = queue[front++];
		//������ ���� ����
		count--;
		
		if (max == front) { //front�� �뷮�� ������ ó�� index�� ����.
			front = 0;
		}
		
		return frontData;
	}
	
	//ť�� ó����
	public int peek() {
		//ť�� ����ִ� �� Ȯ��
		if (count == 0) {
			throw new QueueEmptyException();
		}
			
		return queue[front];
	}
	
	//ť�� �뷮
	public int capacity() {
		return max;
	}
	//ť�� ������ ��
	public int size() {
		return count;
	}
	//ť�� ����ִ���
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else
			return false;
	}
	//ť�� ����á����
	public boolean isFull() {
		if (count == max) {
			return true;
		} else
			return false;
	}
	//ť�� ó��������
	public int peekLast() {
		//ť�� ������ �� ����
		//rear = ����ִ� ĭ�� index
		//rear = 1,2,3,4	-1 -> 0,1,2,3,4
		//rear = 0			-1 -> -1 -> index�� ���� ū ������ ����
		
		if (isEmpty()) return -1;
		
		int index = rear - 1;
		if (index == -1) index = max -1; // 4
		return queue[index];
	}
	public String getAllData() {
		String data = "[";
		//front				rear-1
		//0, 1, 2, 3		4-1
		//3, 4, 0, 1		2-1
		
		if (count > 0) { //�����Ͱ� ������
			int temp = rear;
			if (rear == 0) {
				temp = max -1;
			} else {
				temp = rear -1;
			}
			
			for (int i = front; ; i++ ) {
				if (i == max) i = 0; //index�� max������ 0���� ��ȯ
				data += queue[i];
				if (temp != i)
					data += ", ";// ,		
				if (temp == i)
					break;		 // ������ ���̸�
			}
		}
		data += "]";
		return data;
	}
	public int indexOf(int data) {
		if (count > 0) { //�����Ͱ� ������
			for (int i = front ;; i++) {
				if (i == max) i = 0;
				if (queue[i] == data) return i;
				
				if (rear -1 == i) break;
			}
			return -1;
		} else { //�����Ͱ� ������
			return -1;
		}
	}
//	public boolean remove(int data) {
//		if (isEmpty()) return false; //ť�� ��������� false
//		
//		int index = indexOf(data); //������ �������� �ε����� �˻�
//		if (index == -1) return false; //�ش� �����Ͱ� ������ false
//		
//		for (int i = index; i < count - 1; i++) {
//			queue[i] = queue[i + 1]; //������ �������� ��ġ���� �� ĭ�� ������
//		}
//
//		count--; //������ �� ����
//		rear--; //�������� ���ܿ�
//		return true;
//	}
	public int remove(int data) {
		if (!isEmpty()) { //ť�� ��� �ִ���.
			//������ ���� �ִ� ���� ã�ƾ��Ѵ�.
			int idx = indexOf(data);
			if (idx >= 0) { //�����Ͱ� ������
				// �ѵ����ͼ� - ( �����ִ� index - front )
				int cnt = size() - Math.abs(idx - front);
				
				//			  3		  i+4   
				for (int i = idx; i < idx + cnt; i++) { //3,4,5,6
					//				  (i+max) % max		 (i+1+max)%max
					// 3			  3	- (3 + 5) % 5    4 - (4 + 1 + 5) % 5
					// 4			  4       			 0
					// 5			  0		 			 1
					// 6			  1		 			 2
					queue[(i + max) % max] = queue[(i + 1 + max) % max];
				}
				if (rear == 0) {
					rear = max -1;
				} else {
					rear--;
				}
				count--;
				return data;
			}
		}
		return -1;
	}
	////////////////////////////////////////////////////
	public class QueueOverFlowException extends RuntimeException {
		public QueueOverFlowException() {
			super("ť�� ����á���ϴ�.\nť�� ũ��� " + max + "�Դϴ�.\n���� �������� ���� " + count + "���Դϴ�.");
		}
	}
	public class QueueEmptyException extends RuntimeException {
		public QueueEmptyException() {
			super("ť�� ����ֽ��ϴ�.");
		}
	}
}
