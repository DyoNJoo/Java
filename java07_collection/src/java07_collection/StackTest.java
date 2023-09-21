package java07_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack : 먼저 입력한 객체가 나중에 출력된다. (FILO, LIFO)
		Stack stack = new Stack();
		
		//객체 추가 메소드
		stack.push("홍길동");
		stack.push("김길동");
		stack.push("최길동");
		stack.push("강길동");
		
		//객체 얻어오기
		while(!stack.empty()) {
			String popData = (String)stack.pop();
			System.out.println(popData);
		}
}

	public static void main(String[] args) {
		new StackTest();
	}

}
