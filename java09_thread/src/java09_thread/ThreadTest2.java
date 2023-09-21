package java09_thread;
/*
 * 스레드 생성방법 2
 * 인터페이스 Runnable 상속받아 스레드 구현
 * run() 오버라이딩
 */
public class ThreadTest2 implements Runnable {
	String msg;
	public ThreadTest2() {
		// TODO 자동 생성된 생성자 스텁
	}
	public ThreadTest2(String msg) {
		this.msg = msg;
	}
	@Override //스레드 구현이 가능한 메소드 오버라이딩
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(msg + " ---> " + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadTest2 tt1 = new ThreadTest2("첫번째 Thread");
		ThreadTest2 tt2 = new ThreadTest2("두번째 Thread");
		ThreadTest2 tt3 = new ThreadTest2("세번째 Thread");
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		Thread t3 = new Thread(tt3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
