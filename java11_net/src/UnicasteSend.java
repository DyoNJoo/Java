import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicasteSend {

	public UnicasteSend() {
		// TODO �ڵ� ������ ������ ����
	}

	public void sendStart() {
		try {
			String data = "Java ��Ʈ��ũ ���α׷���";
			
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("211.230.161.174");
			
			DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 9999);
			ds.send(dp);
			System.out.println("������ �Ϸ�");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UnicasteSend().sendStart();

	}

}
