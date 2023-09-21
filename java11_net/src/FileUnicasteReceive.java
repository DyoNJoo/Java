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
			// 512byte를 한번에 전송받을 패킷객체 생성
			byte receiveData[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
			FileOutputStream fos = null;
			while (true) {
				// 받기
				System.out.println("전송받기 대기중......");
				socket.receive(dp);
				
				byte[] data = dp.getData(); //전송받은 데이터
				int lng = dp.getLength(); //전송받은 byte수를 구하기
				//-------------------------------------
				
				String txt = new String(data, 0, lng);
				System.out.println(txt.substring(0, 14));
				//파일명전송 : 파일생성 **%$SendStart[19.jpg
				if (lng >= 14 && txt.substring(0, 14).equals("**%$SendStart[")) {
					//파일생성
					fos = new FileOutputStream(new File("C://Users/이민용/Desktop/풀스택/javaFileText", txt.substring(14)));
					System.out.println("파일생성됨.");
				}
				//마지막알림 : close
				else if (txt.substring(0, 14).equals("**%$EndStart[[")) {
					fos.close();
					socket.close();
					System.out.println("전송받기 f완료됨.");
					break; //반복문 중지
				}
				//내용 : 파일로 쓰기
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
