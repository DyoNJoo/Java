package test08_sturcture;

import java.util.Scanner;

public class IntStackTest {

	public IntStackTest() {
		
	}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(5); // new IntStack(10);
	    
	    while (true) {
	    	System.out.println("데이터의 수 : " + s.size() + ", 스택의 크기 : " + s.capacity());
	    	System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY (7)스택정보표시 (8)REMOVE (9)HELP (0)종료 = ");
	    	int menu = scan.nextInt();
	    	
	    	switch (menu) {
	    	case 0:
	    		System.out.println("프로그램을 종료합니다.");
	    		System.exit(0); //프로그램 종료
	    		break;
	    	case 1: //push
	    		System.out.print("데이터 값 : ");
	    		int data = scan.nextInt();
	    		try {
	    			s.push(data);
	    		} catch (IntStack.OverflowIntStackException oise) {
	    			System.out.println(oise.getMessage());
	    		}
	    		break;
	    	case 2: //pop
	    		try {
	    			int popData = s.pop(); //제일 위에 있는것을 꺼내는것이 pop의 목적
	    			System.out.println("스택의 제일위에 있는 값 : " + popData);
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
	    		//스택의 모든 값을 [12,65,87] []
	    		String dumpData = s.dump();
	    		System.out.println("스택의 모든 데이터 -> " + dumpData);
	    		break;
	    	case 5: //search : 데이터가 있는 index값을 구해준다. 없으면 -1
	    		System.out.print("찾을 값 입력 : ");
	    		int searchData = scan.nextInt();
	    		int idx = s.indexOf(searchData);
	    		System.out.println(searchData + "는(은) " + idx + "에 위치해 있습니다.");
	    		break;
	    	case 6: //empty : 스택의 모든 데이터 지우기
	    		System.out.println("스택에 저장된 모든 데이터를 제거하였습니다.");
	    		s.clear();
	    		break;
	    	case 7: //스택 정보 표시
	    		int size = s.size();
	    		int dataCnt = s.size();
	    		boolean empty = s.isEmpty();
	    		boolean full = s.isFull();
	    		
	    		System.out.println("스택 크기 : " + size);
	    		System.out.println("데이터 수 : " + dataCnt);
	    		System.out.println("현재 스택은 비어" + ((empty) ? "있습니다." : "있지 않습니다."));
	    		System.out.println("현재 스택은 가득" + ((full) ? "찼습니다." : "차지 않았습니다."));	
	    		break;
	    	case 8: //삭제(값)
	    		System.out.print("삭제할 데이터 : ");
	    		int delData = scan.nextInt();
	    		
	    		boolean result = s.remove(delData);
	    		System.out.println(delData + "는(은) 삭제" + ((result)? "되었습니다." : "하지 못하였습니다."));
	    		break;
	    	case 9: 
	    		System.out.println("1. 데이터 넣기, 2. 데이터 빼기, 3. 마지막에 넣은 데이터 탐색, 4. 보관된 스택 데이터 확인");
	    		System.out.println("5. 데이터의 위치 찾기, 6. 스택의 모든 데이터 지우기, 7. 스택의 정보를 표시, 8. 제거");
	    		break;
	    	default:
	    		System.out.println("메뉴를 잘못선택하였습니다.");
	    	}
	    }
	}
}
