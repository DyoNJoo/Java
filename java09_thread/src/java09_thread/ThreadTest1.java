package java09_thread;

//Threadó���� �ϴ� Ŭ���� ����� ��� 1
//ThreadŬ������ ��ӹ޾� �����屸���ϴ� �ڵ带 run()�޼ҵ� �������̵��� �Ѵ�.
//start()�� ȣ�����ش�.

public class ThreadTest1 extends Thread {
	int num = 1;
	String name;
	public ThreadTest1() {
		
	}
	
	public ThreadTest1(String name) {
		this.name = name;
	}
	
	public void run() {
		while(true) {
			System.out.println(name + " -> " + num++);
		}
	}

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("ù��° ������");
		ThreadTest1 tt2 = new ThreadTest1("�ι�° ������");
		
		tt1.start();
		tt2.start(); //����ȵ�.
		

	}

}
