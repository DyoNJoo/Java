package java02_basic_API;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//										 ������, ���б�ȣ
		StringTokenizer st = new StringTokenizer("����,,,,,���,�Ķ�/�ʷ�", ",/");
		System.out.println("��ū�� -> " + st.countTokens());
		
		while (st.hasMoreTokens()) { //true:��ū�� �ִ�. / false:��ū�� ����.
			System.out.println(st.nextToken());
		}
	}

}
