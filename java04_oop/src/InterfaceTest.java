
//인터페이스는
//추상메소드가 존재하면 일반메소드 존재할수 없다

public interface InterfaceTest {
	//static final 변수 -> 상수화된 변수
	public static final int MAX = 1000;
	public static final int MIN = 1;
	
	//추상메소드
	public int add(int a, int b);
	public int minus(int a, int b);
}
