import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileUnicasteSend {

	public FileUnicasteSend() {
		
	}
	
	public void fileSend() {
		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("211.230.161.174"); //�޴� ���� ip��ü
			//��������
			//1. ���ϸ�����
			String filename = "**%$SendStart["+" 19.jpg";	// "**%$SendStart["
			DatagramPacket dp = new DatagramPacket(filename.getBytes(), filename.getBytes().length, ia, 10200);
			socket.send(dp);
			//2. ������ ����
			File f = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText", "19.jpg");
			FileInputStream fis = new FileInputStream(f);
			
			while (true) {
				byte indata[] = new byte[512];
				int inBytes = fis.read(indata, 0, indata.length);
				if (inBytes == -1) break;
				
				//������
				dp = new DatagramPacket(indata, inBytes, ia, 10200);
				socket.send(dp);
			}
			fis.close();
			//3. �������˸�����	012345678901234
			String endMsg = "**%$EndStart[[";
			dp = new DatagramPacket(endMsg.getBytes(), endMsg.length(), ia, 10200);
			socket.send(dp);
			
			socket.close();
			System.out.println("������ �Ϸ��.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicasteSend().fileSend();

	}

}
