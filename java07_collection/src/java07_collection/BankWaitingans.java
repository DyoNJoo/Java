package java07_collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankWaitingans {

	public static int count = 1; //번호를 카운트할 변수
	// 손님정보(도착날짜, 시간, 부여번호)를 VO객체를 담을 Queue 기능이 컬렉션 객체 생성
	public static LinkedList<PersionVO> waitingList = new LinkedList<PersionVO>();
	Scanner s = new Scanner(System.in);
	
	public BankWaitingans() {
		
	}
	
	public void bankStart() {
		while (true) {
			System.out.print("[1. in(손님) / 2. out(은행원)] ");
			int menu = s.nextInt();
			switch (menu) {
			case 1: inGuest(); break;
			case 2: outGuest(); break;
			default:
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}
	}
	
	//번호표를 뽑을때
	public void inGuest() {
		Calendar now = Calendar.getInstance();
		//손님정보가 있는 객체 생성
		PersionVO vo = new PersionVO();
		vo.setNum(count++);
		vo.setDateTime(now);
		
		//대기열에 추가하기
		waitingList.offer(vo);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:MM (E)");
		String nowTxt = fmt.format(now.getTime());
		//Message 출력					vo 객체의 수
		System.out.println("대기인수 : " + waitingList.size() + " --> 날짜 : " + nowTxt + ", 번호 : " + vo.getNum())
		;
	}
	//호출 되었을때
	public void outGuest() {
		try {
			PersionVO vo = waitingList.pop();
			System.out.println("대기인수 : " + waitingList.size() + ", 번호 : " + vo.getNum());
		} catch (NoSuchElementException ne) {
			System.out.println("대기자가 존재하지 않습니다.");
		}
	}
	public static void main(String[] args) {
		BankWaitingans bw = new BankWaitingans();
		bw.bankStart();
	}

}
