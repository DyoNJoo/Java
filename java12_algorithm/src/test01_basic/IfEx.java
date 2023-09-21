package test01_basic;

import java.util.Scanner;

public class IfEx {

	public IfEx() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		System.out.print("국어점수입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수입력 : ");
		int math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;
		
		String result = "";
		
		if (kor < 40 || eng < 40 || math < 40) {
			result = "과락으로 불합격";
		} else {
			if (avg >= 60) {
				result = "합격";
			} else {
				result = "불합격";
			}
		}

		System.out.println("결과 = " + result);
	}

}
