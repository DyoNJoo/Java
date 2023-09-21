import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileUnicasteReceive {

	public FileUnicasteReceive() {
	
	}
	
	public void fileReceive() {
		try {
			DatagramSocket socket = new DatagramSocket(10200);
			// 512byte�� �ѹ��� ���۹��� ��Ŷ��ü ����
			byte receiveData[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
			FileOutputStream fos = null;
			while (true) {
				// �ޱ�
				System.out.println("���۹ޱ� �����......");
				socket.receive(dp);
				
				byte[] data = dp.getData(); //���۹��� ������
				int lng = dp.getLength(); //���۹��� byte���� ���ϱ�
				//-------------------------------------
				
				String txt = new String(data, 0, lng);
				System.out.println(txt.substring(0, 14));
				//���ϸ����� : ���ϻ��� **%$SendStart[19.jpg
				if (lng >= 14 && txt.substring(0, 14).equals("**%$SendStart[")) {
					//���ϻ���
					fos = new FileOutputStream(new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText", txt.substring(14)));
					System.out.println("���ϻ�����.");
				}
				//�������˸� : close
				else if (txt.substring(0, 14).equals("**%$EndStart[[")) {
					fos.close();
					socket.close();
					System.out.println("���۹ޱ� f�Ϸ��.");
					break; //�ݺ��� ����
				}
				//���� : ���Ϸ� ����
				else if(lng > 0) {
					fos.write(data, 0, lng);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicasteReceive().fileReceive();

	}

}
