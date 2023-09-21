import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MulticasteReceive {

	public MulticasteReceive() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void multicasteReceiveStart() {
		try {
			int port = 15000;
			MulticastSocket ms = new MulticastSocket(port);
			
			InetAddress ia = InetAddress.getByName("224.100.100.100");
			InetSocketAddress isa = new InetSocketAddress(ia, port);
			
			NetworkInterface nif = NetworkInterface.getByName("lmy");
			//이민용 -> 24
			ms.joinGroup(isa, nif);
			
			byte data[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//받기 대기중
			System.out.println("전송받기 대기중");
			ms.receive(dp);
			
			///////////////////////////////////////////////////////////
			byte receiveData[] = dp.getData();
			String receiveStr = new String(receiveData, 0, dp.getLength());
			System.out.println("받은 문자열 : " + receiveStr);
			
			ms.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MulticasteReceive().multicasteReceiveStart();

	}

}
