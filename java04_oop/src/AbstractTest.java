//추상클래스는 추상메소드를 1개이상 포함하고 있는 클래스이다.
//추상메소드를 포함하고 있는 클래스는 class 키워드 왼쪽에 abstract를 기재한다.
//추상클래스는 사용할때 반드시 상속을 받아야함.
//모든 추상메소드를 오버라이딩을 하여야 한다.
public abstract class AbstractTest extends AbstractSuper {
    public AbstractTest() {
    
    }

    public void method1() {
        System.out.println("method1() 실행됨");
    }

    // 추상 메소드
    public abstract void plus(int a, int b);

    public abstract int minus(int x, int y);
}
