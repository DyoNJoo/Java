
public class VariableTest {

	public static void main(String[] args) {
		// 변수 : 값을 보관하는 것
		// 정수 : byte(1), short(2), int(4 : 기본데이터형), long(8)
		int age;
		int age2 = 25;
		byte kor = 50;
		
		long maxdata = 2148974988954894L; //정수형 상수(리터널)는 int형이기 때문에 int형 크기보다 큰 경우에는 L을 기입함.
		// "문자열"과 숫자형변수를 + 연산을 하면 연결됨. age는 지역변수지만 초기값이 없어서 사용불가.
		//System.out.println("age = " + age);
		System.out.println("age2 = " + age2);
		System.out.println("score = " + kor);
		System.out.println("maxdata = " + maxdata);
		
		//float(4), double(8)
		float height = 175.6f;
		double key = 175.6;
		
		System.out.println("height = " + height);
		System.out.println("key = " + key);
		
		//논리 : boolean -> true, false;
		boolean boo = false;
		System.out.println("boo -> " + boo);
		
		//문자 : char(2) : 1개의 문자만 보관 가능.
		
		char c1 = 'A'; //단따옴표
		char c2 = '컴';
		
		int r1 = c1 + 1; //B
		//A + 1 = 66;
		//A = 65;
		System.out.println("r1 = " + r1);
		
		char r2 = (char)(c1 + 1); //강제형변환 : type castring
		System.out.println("r2 = " + r2);
		
		int keyint = (int)key;
		System.out.println("keyInt = " + keyint);
		
		//작은데이터형을 큰 데이터형에 대입할때는 자동으로 형변환이 된다.
		double data1 = 2356;
		System.out.println("data1 = " + data1);
		
		String name = "홍길동";
		System.out.println("name = " + name);
		
		byte num1 = (byte)130;
		System.out.println("num1 = " + num1);
		
	}
	
}
