

public class B extends A {
	
	int isbn = 78910;
	String book = "HTML";
	public B() {
		//상위클래스의 생성자중에 매개변수가 있는 생성자를 실행할 경우
		//super키워드를 이용하여 상위클래스의 생성자를 호출해준다.
		//첫번째 실행문으로 표기하여야한다.
		//this() : 같은 클래스의 다른 생성자 호출
		//super() : 상위 클래스의 다른 생성자 호출
		super("사과");
		System.out.println("B클래스의 생성자 메소드 실행됨.");
		// 상위 클래스와 하위클래스에서 같은 필드명일때 현재클래스의 변수를 접근한다.
		System.out.println(isbn + "====" + book + "====" + super.book);
		
		//현재클래스 없는 변수는 this를 표기하더라도 상위클래스의 변수에 접근한다.
		//상위클래스는 하위클래스의 어떠한 기능도 사용할 수 없다.
		System.out.println(this.isbn + " ====> " + super.isbn);
		
		//상위클래스 변수, 메소드는 private 접근제한자일때 상속하지 않는다.
		//System.out.println("author = " + super.author);
		
		//상위 클래스의 메소드를 호출
		method1();
		inherTest(50);
		
	}
	public void inherTest(int max) {
		int total = 0;
		for (int i = 1; i <= max; i++) {
			total += i;
		}
		System.out.println("1~" + max + "까지의 합은 " + total);
	}
	@Override
	public void sum(int max) {
		int total = 0;
		for (int i = 1; i <= max; i += 2) {
			total += i;
		}
		System.out.println("1~" + max + "까지의 합은 " + total);
		//return total;	
	}
}
