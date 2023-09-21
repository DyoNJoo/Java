import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void startUrl() {
		try {
			//				   ��������		host	 ����						����	   ��
			URL url = new URL("https://auto.nate.com/news/articleView.html?idxno=38405");
			
			
			//��������, port, hostname, ���ϸ�
			System.out.println("�������� -> " + url.getProtocol());
			System.out.println("ȣ��Ʈ -> " + url.getHost());
			System.out.println("���� -> " + url.getFile());
			System.out.println("��Ʈ -> " + url.getPort());
			System.out.println("������ -> " + url.getQuery());
			
			//==========================================================================
			//1. url��ü�� �̿��Ͽ� URLConnection ��ü�� ���Ѵ�.
			
			URLConnection connection = url.openConnection();
			
			//2. URLConnection ��ü�� ��� ä���� Ȯ���ϱ�
			connection.connect();
			
			//3. pageHeader ���� ������

			String contentType = connection.getContentType();
			System.out.println(contentType);
			
			//012345678901234567890123
			//text/html; charset=UTF-8
			
			int idx = contentType.indexOf("charset=");
			String encode = contentType.substring(idx + 8);
			
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, encode);
			BufferedReader br = new BufferedReader(isr);

			FileOutputStream fos = new FileOutputStream(new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText","nate.txt"));
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
