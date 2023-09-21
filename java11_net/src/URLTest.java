import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void startUrl() {
		try {
			//				   프로토콜		host	 파일						변수	   값
			URL url = new URL("https://auto.nate.com/news/articleView.html?idxno=38405");
			
			
			//프로토콜, port, hostname, 파일명
			System.out.println("프로토콜 -> " + url.getProtocol());
			System.out.println("호스트 -> " + url.getHost());
			System.out.println("파일 -> " + url.getFile());
			System.out.println("포트 -> " + url.getPort());
			System.out.println("데이터 -> " + url.getQuery());
			
			//==========================================================================
			//1. url객체를 이용하여 URLConnection 객체를 구한다.
			
			URLConnection connection = url.openConnection();
			
			//2. URLConnection 객체의 통신 채널을 확보하기
			connection.connect();
			
			//3. pageHeader 정보 얻어오기

			String contentType = connection.getContentType();
			System.out.println(contentType);
			
			//012345678901234567890123
			//text/html; charset=UTF-8
			
			int idx = contentType.indexOf("charset=");
			String encode = contentType.substring(idx + 8);
			
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, encode);
			BufferedReader br = new BufferedReader(isr);

			FileOutputStream fos = new FileOutputStream(new File("C://Users/이민용/Desktop/풀스택/javaFileText","nate.txt"));
			while (true) {
				String inData = br.readLine();
				if (inData == null) break;
				inData = inData + "\n";
				fos.write(inData.getBytes(), 0, inData.getBytes().length);
				//System.out.println(inData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new URLTest().startUrl();

	}

}
