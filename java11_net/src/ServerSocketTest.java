

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public ServerSocketTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void serverStart() {
		//���ӹޱ�
		try {
			//ServerSocket��ü�� ���� ���� �� �ִ�.
			ServerSocket ss = new ServerSocket(20000);
			
			System.out.println("���Ӵ����.....");
			Socket s = ss.accept();
			
			//�������� ip�� Socket�� ������ �ִ�.
			InetAddress clientIa = s.getInetAddress();
			System.out.println(clientIa.getHostAddress() + " --> Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			//�����ڿ��� ���ں�����
			OutputStream os = s.getOutputStream(); // 1byte
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8"); //1����
			PrintWriter pw = new PrintWriter(osw); //1��
			
			pw.println("�ȳ�... hi... ������ ���ӵǾ���...");
			pw.flush();
			
			//Ŭ���̾�Ʈ ���� ���� �ޱ�
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
			
			String inData = br.readLine();
			System.out.println("������ ���� ����(Ŭ���̾�Ʈ) --> " + inData);
			//close()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerSocketTest().serverStart();

	}

}
