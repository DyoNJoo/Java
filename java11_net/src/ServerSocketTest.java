

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
		// TODO 자동 생성된 생성자 스텁
	}

	public void serverStart() {
		//접속받기
		try {
			//ServerSocket객체를 접속 받을 수 있다.
			ServerSocket ss = new ServerSocket(20000);
			
			System.out.println("접속대기중.....");
			Socket s = ss.accept();
			
			//접속자의 ip를 Socket이 가지고 있다.
			InetAddress clientIa = s.getInetAddress();
			System.out.println(clientIa.getHostAddress() + " --> 클라이언트가 접속하였습니다.");
			
			//접속자에게 문자보내기
			OutputStream os = s.getOutputStream(); // 1byte
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8"); //1문자
			PrintWriter pw = new PrintWriter(osw); //1줄
			
			pw.println("안녕... hi... 서버에 접속되었어...");
			pw.flush();
			
			//클라이언트 보낸 문자 받기
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
			
			String inData = br.readLine();
			System.out.println("서버가 받은 문자(클라이언트) --> " + inData);
			//close()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerSocketTest().serverStart();

	}

}
