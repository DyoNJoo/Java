

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketTest {

	public ClientSocketTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void clientStart() {
		try {
			InetAddress ia = InetAddress.getByName("211.230.161.174");
			
			//SocketŬ������ ��ü�� �����ϸ� ������ ������ �Ϸ�
			Socket s = new Socket(ia, 20000);
			System.out.println("������ ���� �Ǿ����ϴ�.");
			
			//������ ���� ���� �ޱ�
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String inputData = br.readLine();
			System.out.println("������ ��������(��������) -> " + inputData);
			
			//Ŭ���̾�Ʈ�� ������ �����ͺ�����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
			
			pw.println("client�� ������ ������ ����");
			pw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClientSocketTest().clientStart();
	}

}
