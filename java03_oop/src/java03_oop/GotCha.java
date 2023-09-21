package java03_oop;

import java.util.*;

public class GotCha {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
	    Random ran = new Random();
	    int answer = ran.nextInt(100) + 1;
	    int count = 0;
	    boolean correct = false;
	
	    System.out.println("숫자 맞추기 게임");
	    System.out.println("숫자 1~100사이의 정수를 입력하세요 - ");
		
		while (!correct) {
			count++;
			int num = sc.nextInt();

			if (num < 1 || num > 100) {
				System.out.println("숫자는 1보다 작거나 100보다 크면 안 됩니다.");
			}
			else if (num < answer) {
				System.out.println("더 큰값을 입력하세요.");
			}
			else if (num > answer) {
				System.out.println("더 작은값을 입력하세요.");
			}
			else {
				correct = true;
				System.out.printf("맞추었습니다. 난수 = %d\n", answer);
				System.out.printf("%d번만에 맞추었습니다.", count);
			}
		}
	}
	
	public static void main(String[] args) {
		GotCha game = new GotCha();
		game.start();
	}
}
