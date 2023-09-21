package java07_collection;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		//Properties : Ű�� value�� String�̿��� �Ѵ�.
		
		Properties prop = new Properties();
		
		prop.setProperty("/", "/index.jsp");
		prop.setProperty("/boardList", "/board/boardList.jsp");
		prop.setProperty("/member", "/member/memberForm.jsp");
		prop.setProperty("/notice", "/notice/noticeView.jsp");
		
		String page = prop.getProperty("/notice");
		System.out.println("/notice --> " + page);		
		Enumeration keyList = prop.propertyNames();//key ��� ���ϱ�
		
		while (keyList.hasMoreElements()) {
			String key = (String)keyList.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " --> " + value);
		}
	}

	public static void main(String[] args) {
		new PropertiesTest();

	}

}
