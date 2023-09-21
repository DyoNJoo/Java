package com.muitlcampus;

public class Test {
	
	public int num = 1234; //접근제한자는 default
	
	public Test() {
		
	}
	
	public void plus(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
