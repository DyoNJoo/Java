/*
	224.0.0.0 ~ 239.255.255.255

	224.100.100._ ~ 224
 */

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticasteSend {

	public MulticasteSend() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void multicasteSendStart() {
		String msg = "��Ƽĳ��Ʈ�� �̿��� ������ �����ϱ� ������.";
		try {
			MulticastSocket ms = new MulticastSocket();
			
			InetAddress ia = InetAddress.getByName("211.230.161.174");
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 15000);
			
			ms.send(dp);// ��������Ƿ� ���� ������
			System.out.println("Send �Ϸ��.");
			ms.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MulticasteSend().multicasteSendStart();

	}

}
