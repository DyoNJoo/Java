import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UnicasteReceive {

	public UnicasteReceive() {
		// TODO �ڵ� ������ ������ ����
	}
	public void receiveStart() {
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("�ޱ� �����.....");
			ds.receive(dp);
			
			//���� �� ó��
			byte[] receiveData = dp.getData();
			System.out.println("length -> " + dp.getLength());
			System.out.println(new String(receiveData/*, 0, dp.getLength(), "UTF-8"*/));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UnicasteReceive().receiveStart();

	}

}
