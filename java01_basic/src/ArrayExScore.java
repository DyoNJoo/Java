import java.util.Scanner;


public class ArrayExScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력받아 개인별 총점, 평균, 석차, 과목별 총점, 평균
		String title[] = { "국어", "영어", "수학" };
		
		//학생 수 입력받아 데이터를 저장할 공간 확보
		System.out.print("학생수 = ");
		int cnt = Integer.parseInt(sc.nextLine()); // "5" -> 5
		
		//학생명을 저장할 배열
		String names[] = new String[cnt]; //학생수 만큼 저장, ex) 5 -> index 0,1,2,3,4
		//점수, 총점, 평균, 석차 등을 저장할 배열
		double jumsu[][] = new double[cnt + 2][6]; //밑에 과목별 총점과 평균이 있어야 하므로 cnt + 2
		
		//기본데이터 입력받기
		
		for (int i = 0; i < cnt; i++) {//학생수만큼
			System.out.print("학생이름 = ");
			names[i] = sc.nextLine();
			for (int j = 0; j < title.length; j++) {
				System.out.print(title[j] + " = ");
				jumsu[i][j] = Double.parseDouble(sc.nextLine());
			}
		}
		
		//성적처리
		for (int i = 0; i < cnt; i++) { //0, 1, 2, 3, 4
			for (int j = 0; j < title.length; j++) {
				jumsu[i][3] += jumsu[i][j]; //개인별 총점
				jumsu[cnt][j] += jumsu[i][j]; //과목별총점
			}
			jumsu[i][4] = jumsu[i][3] / title.length; //개인별 평균
		}
		
		//과목별 평균
		for (int i = 0; i < title.length; i++) {
			jumsu[cnt + 1][i] = jumsu[cnt][i] / cnt;
		}
		
		//석차구하기
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(jumsu[i][4] < jumsu[j][4]) {
					jumsu[i][5]++; //석차변수의 값을 1증가
				}
			}
			jumsu[i][5]++;
		}
		
		//출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		
		for (int i = 0; i < names.length + 2; i++) {
			if (i == cnt) {
				System.out.print("총점\t");
			}
			else if (i == cnt + 1) {
				System.out.print("평균\t");
			}
			else {
				System.out.print(names[i] + "\t"); //이름 출력
			}
			
			//각과목, 총점, 평균, 석차
			for (int j = 0; j < jumsu[i].length; j++) {
				if(j == 5) {
					System.out.printf("%8d", (int)jumsu[i][j]);
				}
				else {
					System.out.printf("%8.1f", jumsu[i][j]);
				}
			}
			System.out.println();
		}
		
	}

}
