package test08_sturcture;

public class IntQueue {
	//데이터를 담을 배열
	private int queue[];
	
	private int front; //앞쪽(디큐)위치
	private int rear; //뒤쪽(인큐)위치
	
	private int max; //큐의 크기 : 용량
	private int count; //데이터 수
		
	public IntQueue() {
		this(10);
	}
	public IntQueue(int capacity) {
		max = capacity;
		front = rear = count = 0;
		try {
			//큐 생성(배열)
			queue = new int[capacity];
		} catch (OutOfMemoryError oome) {
			System.out.println("메모리가 부족합니다.");
		}
	}
	public int enqueue(int data) {
		//큐가 가득찼을 때
		if (max == count) {
			throw new QueueOverFlowException();
		}
		
		//큐가 여유가 있을 때
		//현재 rear의 위치에 값을 추가 하고 rear는 1증가 시킨다.
		queue[rear++] = data;
		
		//데이터의 수 증가
		count++;
		
		//rear가 배열의 끝까지 이동했을때 0으로 index를 변경
		if (max == rear) rear = 0;
		return data;
	}
	public int dequeue() {
		//큐가 비어있는 지 확인
		if (count == 0) {
			throw new QueueEmptyException();
		}
		
		//front위치를 값을 돌려주고, front는 1증가
		int frontData = queue[front++];
		//데이터 수를 감소
		count--;
		
		if (max == front) { //front와 용량과 같으면 처음 index로 변경.
			front = 0;
		}
		
		return frontData;
	}
	
	//큐의 처음값
	public int peek() {
		//큐가 비어있는 지 확인
		if (count == 0) {
			throw new QueueEmptyException();
		}
			
		return queue[front];
	}
	
	//큐의 용량
	public int capacity() {
		return max;
	}
	//큐의 데이터 수
	public int size() {
		return count;
	}
	//큐가 비어있는지
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else
			return false;
	}
	//큐가 가득찼는지
	public boolean isFull() {
		if (count == max) {
			return true;
		} else
			return false;
	}
	//큐의 처음데이터
	public int peekLast() {
		//큐의 마지막 값 리턴
		//rear = 비어있는 칸의 index
		//rear = 1,2,3,4	-1 -> 0,1,2,3,4
		//rear = 0			-1 -> -1 -> index의 제일 큰 값으로 변경
		
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
		
		if (count > 0) { //데이터가 있을때
			int temp = rear;
			if (rear == 0) {
				temp = max -1;
			} else {
				temp = rear -1;
			}
			
			for (int i = front; ; i++ ) {
				if (i == max) i = 0; //index와 max같으면 0으로 변환
				data += queue[i];
				if (temp != i)
					data += ", ";// ,		
				if (temp == i)
					break;		 // 마지막 값이면
			}
		}
		data += "]";
		return data;
	}
	public int indexOf(int data) {
		if (count > 0) { //데이터가 있을때
			for (int i = front ;; i++) {
				if (i == max) i = 0;
				if (queue[i] == data) return i;
				
				if (rear -1 == i) break;
			}
			return -1;
		} else { //데이터가 없을때
			return -1;
		}
	}
//	public boolean remove(int data) {
//		if (isEmpty()) return false; //큐가 비어있을때 false
//		
//		int index = indexOf(data); //삭제할 데이터의 인덱스를 검색
//		if (index == -1) return false; //해당 데이터가 없으면 false
//		
//		for (int i = index; i < count - 1; i++) {
//			queue[i] = queue[i + 1]; //삭제한 데이터의 위치부터 한 칸씩 앞으로
//		}
//
//		count--; //데이터 수 감소
//		rear--; //앞쪽으로 땡겨옴
//		return true;
//	}
	public int remove(int data) {
		if (!isEmpty()) { //큐가 비어 있는지.
			//삭제할 값이 있는 곳을 찾아야한다.
			int idx = indexOf(data);
			if (idx >= 0) { //데이터가 있을때
				// 총데이터수 - ( 값이있는 index - front )
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
			super("큐가 가득찼습니다.\n큐의 크기는 " + max + "입니다.\n현재 데이터의 수는 " + count + "개입니다.");
		}
	}
	public class QueueEmptyException extends RuntimeException {
		public QueueEmptyException() {
			super("큐가 비어있습니다.");
		}
	}
}
