package test05.ex.backjoon;

import java.util.Scanner;

public class Baekjoon_1244 {

	public Baekjoon_1244() {
		// TODO 자동 생성된 생성자 스텁
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//스위치 개수
		int switchCount = s.nextInt();
		int switches[] = new int[switchCount]; // 스위치의 갯수만큼 배열을 생성한다.
		
		//스위치의 상태 입력
		for (int i = 0; i < switchCount; i++) {
			switches[i] = s.nextInt();
		}
		
		//학생 수
		int stuCount = s.nextInt();
		
		//학생의 정보를 받고 스위치 조작
		for (int i = 0; i < stuCount; i++) {
			int gender = s.nextInt(); //학생의 성별 
			int switchNum = s.nextInt(); //학생이 부여받을 스위치의 번호
			
			if (gender == 1) { //남학생인 경우
				for (int j = switchNum - 1; j < switchCount; j += switchNum) {
					switches[j] = 1 - switches[j];
				}
			} else if (gender == 2) { //여학생인 경우
				switchNum--;
				int left = switchNum;
				int right = switchNum;
				//좌우대칭
					
				while (left >= 0 && right < switchCount && switches[left] == switches[right]) {
					switches[left] = 1 - switches[left];
					switches[right] = 1 - switches[right];
					left--;
					right++;
				}
			}
		}
		
		//출력
		for (int i = 0; i < switchCount; i++) {
			System.out.print(switches[i] + " ");
		}
	}

}
