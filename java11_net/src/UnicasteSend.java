import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicasteSend {

	public UnicasteSend() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void sendStart() {
		try {
			String data = "Java 네트워크 프로그래밍";
			
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("211.230.161.174");
			
			DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 9999);
			ds.send(dp);
			System.out.println("보내기 완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UnicasteSend().sendStart();

	}

}
