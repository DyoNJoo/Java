package java09_thread;
/*
 * ������ ������� 2
 * �������̽� Runnable ��ӹ޾� ������ ����
 * run() �������̵�
 */
public class ThreadTest2 implements Runnable {
	String msg;
	public ThreadTest2() {
		// TODO �ڵ� ������ ������ ����
	}
	public ThreadTest2(String msg) {
		this.msg = msg;
	}
	@Override //������ ������ ������ �޼ҵ� �������̵�
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(msg + " ---> " + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadTest2 tt1 = new ThreadTest2("ù��° Thread");
		ThreadTest2 tt2 = new ThreadTest2("�ι�° Thread");
		ThreadTest2 tt3 = new ThreadTest2("����° Thread");
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		Thread t3 = new Thread(tt3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
