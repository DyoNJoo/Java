package java11_net;

import java.net.InetAddress;

public class InetAddressText {

	public InetAddressText() {
		// TODO �ڵ� ������ ������ ����
	}

	public void start() {
		//InetAddress : ���� pcip, �������� ip�� ���� ���� �ִ�.
		
		try {
			//����ǻ���� ip���ϱ�
			InetAddress ia1 = InetAddress.getLocalHost();
			System.out.println("ia1.address -> " + ia1.getHostAddress()); //ip���
			System.out.println("ia1.name -> " + ia1.getHostName()); //url�� ������.
			
			//url�ּҸ� �̿��Ͽ� InetAddress��ü ���� (www.nate.com, www.naver.com)
			InetAddress ia2 = InetAddress.getByName("www.nate.com");
			System.out.println("ia2.address -> " + ia2.getHostAddress());
			System.out.println("ia2.name -> " + ia2.getHostName());
			
			//ip�� �̿��Ͽ� InetAddress��ü ����
			InetAddress ia3 = InetAddress.getByName("120.50.131.112");
			System.out.println("ia3.address -> " + ia3.getHostAddress());
			System.out.println("ia3.name -> " + ia3.getHostName());
			System.out.println("------------------------------------------");
			
			//InetAddress��ü ���ϱ�
			InetAddress[] ia4 = InetAddress.getAllByName("www.naver.com");
			for (InetAddress ia : ia4) {
				System.out.println("address -> " + ia.getHostAddress());
				System.out.println("name -> " + ia.getHostName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InetAddressText().start();

	}

}
