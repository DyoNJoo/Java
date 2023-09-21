//1. 추상클래스 상속

public class AbstractMain extends AbstractTest {

	public AbstractMain() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	@Override
	public void plus(int i, int j) {
		int r = i + j;
		System.out.printf("%d + %d = %d\n", i, j, r);
	}
	
	@Override
	public int minus(int x, int y) {
		return 0;
	}
	
	@Override
	public void multiple() {
		System.out.println("multiple() 메소드 실행");
	}

	public static void main(String[] args) {
		//추상클래스는 미완의 메소드가 포함되어 있으므로 객체를 생성할 수 없음.
		//AbstractTest at = new AbstractTest();
		
		AbstractMain am = new AbstractMain();
		am.method1();
		am.plus(45, 12);
		am.multiple();
	}

}
