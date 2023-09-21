package java03_oop;

import java.util.Scanner;

public class SampleMain {
		
	public static void main(String[] args) {
		Sample sam = new Sample();
		
//		int sum = sam.total();
//		System.out.println("sum() -> " + sum);
//		
//		sam.oddnumber(500);
		
		//한번 호출로 합, 홀수합, 짝수합이 다 나와야 함.
		sam.allSum(10);
		sam.oddnumber(50);
	}
	
}
