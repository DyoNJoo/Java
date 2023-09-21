package java02_basic_API;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//										 데이터, 구분기호
		StringTokenizer st = new StringTokenizer("빨강,,,,,노랑,파랑/초록", ",/");
		System.out.println("토큰수 -> " + st.countTokens());
		
		while (st.hasMoreTokens()) { //true:토큰이 있다. / false:토큰이 없다.
			System.out.println(st.nextToken());
		}
	}

}
