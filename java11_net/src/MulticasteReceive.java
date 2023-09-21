import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MulticasteReceive {

	public MulticasteReceive() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void multicasteReceiveStart() {
		try {
			int port = 15000;
			MulticastSocket ms = new MulticastSocket(port);
			
			InetAddress ia = InetAddress.getByName("224.100.100.100");
			InetSocketAddress isa = new InetSocketAddress(ia, port);
			
			NetworkInterface nif = NetworkInterface.getByName("lmy");
			//�̹ο� -> 24
			ms.joinGroup(isa, nif);
			
			byte data[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//�ޱ� �����
			System.out.println("���۹ޱ� �����");
			ms.receive(dp);
			
			///////////////////////////////////////////////////////////
			byte receiveData[] = dp.getData();
			String receiveStr = new String(receiveData, 0, dp.getLength());
			System.out.println("���� ���ڿ� : " + receiveStr);
			
			ms.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MulticasteReceive().multicasteReceiveStart();

	}

}
