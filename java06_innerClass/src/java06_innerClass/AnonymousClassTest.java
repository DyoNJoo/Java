package java06_innerClass;

public class AnonymousClassTest {
	String name = "블랙핑크";
	public AnonymousClassTest() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void start() {
		//익명의 내부 클래스
		Sample s = new Sample() {
			//Sample 클래스 sum() 메소드를 오버라이딩
			public void sum() {
				int evenSum = 0;
				for (int i = 2; i <= 100; i += 2) {
					evenSum += i;
				}
				System.out.println("evenSum = " + evenSum);
			}
			//메소드 추가
			public void print() {
				System.out.println(num + " -> " + name);
			}
		};		//.sum();	//.print();
		
		s.sum(); //오버라이딩 메소드가 유지되고 있음
		//s.print(); //익명의 내부클래스에서 추가한 메소드는 숨김처리된다.
	}
	public static void main(String[] args) {
		new AnonymousClassTest().start();

	}

}
