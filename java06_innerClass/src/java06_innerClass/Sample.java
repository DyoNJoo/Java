package java06_innerClass;

public class Sample {
	int num = 9999;
	public Sample() {
		System.out.println("샘플 생성자 메소드");
	}
	// 합
	public void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	//홀수 합
	public void oddSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("oddSum = " + sum);
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
