package java02_basic_API;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		
	}

	public void start() {
		//���ó�¥ -> 2023-07-31(��) 12:41 ����
		//1. Calendar ��ü ����
		Calendar now = Calendar.getInstance(); //OS�� ������ �ð��� ������ Calendar ��ü ���
		
		//SimpleDateFormat : ���ϴ� ����(Format)��ü�� �����
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm a");
		
		//���˿� ��¥ ����
		String fmtTxt = fmt.format(now.getTime());
		System.out.println(fmtTxt);
		
		//2. ���� �������� ���˸����
		int numData = 25426442; //25,426,442��
		//			  23 -> 23��
		//			  43543 -> 43,543��
		DecimalFormat won = new DecimalFormat("#,###��");
		String decTxt = won.format(numData);
		System.out.println(numData + " -> " + decTxt);
		
		//3. MessageFormat : �����͸� ���ϴ� ������ ���ڿ��� �����
		String username = "ȫ�浿";
		String tel = "010-1234-5678";
		//ȸ���� : ȫ�浿		����ó : 010-1234-5678
		//					����, Object, Object...
		String msgFmt = MessageFormat.format("ȸ����:{0}\t����ó:{1}\n�ּ�:{2}", username, tel, "����� ������");
		System.out.println(msgFmt);
	}
	
	public static void main(String[] args) {
		new FormatTest().start();
		
	}

}
