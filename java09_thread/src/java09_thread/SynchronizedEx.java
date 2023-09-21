package java09_thread;

public class SynchronizedEx implements Runnable {
	private int depositeMoney = 10000;
	public SynchronizedEx() {
		// TODO �ڵ� ������ ������ ����
	}

	public void run() {
		//������ ����ȭ : �����带 ������϶� �ٸ� ������ ��⸦ �ϰ� ���� ������ ������ ������ ���������� ������.
			//synchronized (this) {	
				//1���� 1000�� 7�� �����ϱ�
				for (int i = 1; i <= 7; i++) {
					try {
						Thread.sleep(1000); //�����ð�(�и���)���� ������ �Ͻ�����
					} catch(Exception e) {
						withDraw(1000);
					}
				}
		//}
	}
	
	public void withDraw(int howMuch) { //�����ϴ� �޼ҵ�
		if (depositeMoney >= howMuch) { //�ܾ��� ������
			depositeMoney -= howMuch;														 //���� ����Ǵ� �������� �̸�
			System.out.printf("��ݾ� : %d, ,�ܾ� : %d, ������ : %s\n", howMuch, depositeMoney, Thread.currentThread().getName());
		} else { //�ܾ��� ������
			System.out.println("����� : " + Thread.currentThread().getName());
			System.out.println("�ܾ��� �����մϴ�.");
			
			//���� �������� �����带 �����ϱ�
			try {
				this.wait();
			} catch (Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		SynchronizedEx ATM = new SynchronizedEx();
		
		Thread mother = new Thread(ATM, "mother");
		Thread son = new Thread(ATM, "son");
		
		mother.start();
		son.start();
	}

}
