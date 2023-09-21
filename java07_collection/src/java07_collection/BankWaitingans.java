package java07_collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankWaitingans {

	public static int count = 1; //��ȣ�� ī��Ʈ�� ����
	// �մ�����(������¥, �ð�, �ο���ȣ)�� VO��ü�� ���� Queue ����� �÷��� ��ü ����
	public static LinkedList<PersionVO> waitingList = new LinkedList<PersionVO>();
	Scanner s = new Scanner(System.in);
	
	public BankWaitingans() {
		
	}
	
	public void bankStart() {
		while (true) {
			System.out.print("[1. in(�մ�) / 2. out(�����)] ");
			int menu = s.nextInt();
			switch (menu) {
			case 1: inGuest(); break;
			case 2: outGuest(); break;
			default:
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�.");
			}
		}
	}
	
	//��ȣǥ�� ������
	public void inGuest() {
		Calendar now = Calendar.getInstance();
		//�մ������� �ִ� ��ü ����
		PersionVO vo = new PersionVO();
		vo.setNum(count++);
		vo.setDateTime(now);
		
		//��⿭�� �߰��ϱ�
		waitingList.offer(vo);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:MM (E)");
		String nowTxt = fmt.format(now.getTime());
		//Message ���					vo ��ü�� ��
		System.out.println("����μ� : " + waitingList.size() + " --> ��¥ : " + nowTxt + ", ��ȣ : " + vo.getNum())
		;
	}
	//ȣ�� �Ǿ�����
	public void outGuest() {
		try {
			PersionVO vo = waitingList.pop();
			System.out.println("����μ� : " + waitingList.size() + ", ��ȣ : " + vo.getNum());
		} catch (NoSuchElementException ne) {
			System.out.println("����ڰ� �������� �ʽ��ϴ�.");
		}
	}
	public static void main(String[] args) {
		BankWaitingans bw = new BankWaitingans();
		bw.bankStart();
	}

}
