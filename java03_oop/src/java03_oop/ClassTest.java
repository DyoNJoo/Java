package java03_oop;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class ClassTest {
	int num = 1234;
	String name = "ȫ�浿";
	
	int data; //�ʱⰪ�� 0
	Scanner scan = new Scanner(System.in); //��ü����� �ʱⰪ
	Scanner scan2; // null
	
	int a[]; // null
	int b[] = new int[5]; // 0 0 0 0 0
	
	Random ran = new Random();
	
	final int BAN = 3;
	final int BUN = 25;
	
	//������ �޼ҵ� : newŰ����� Ŭ������ ��ü�� ���鶧 �ʿ��ϴ�.
	//			  �����ڸ޼ҵ���� Ŭ������� ���ƾ� �Ѵ�.
	//			  ��ü������ 1�� �����
	//			  �Ű��������� ������ �޼ҵ�� ������ �����Ͻ� �����Ϸ� �����ڸ� ������ش�.
	
	//������ �޼ҵ� �����ε� : ������ �޼ҵ尡 �������϶�
	//�Ű�����(arguments) ������ �ٸ��ų�, ���������� �޶�� ��.
	public ClassTest() {
		//������ �޼ҵ� ���� : if, for, ��������, �迭����, ��ü����
		System.out.println("ClassTest() ������ �޼ҵ� ����...");
		int kor = 60;
		System.out.println(name + " = " + kor);
	}
	public ClassTest(int num) {
		System.out.println("num = " + num);
	}
	public ClassTest(String colorName) {
		System.out.println("colorName = " + colorName);
	}
	public ClassTest(int num, String colorName) {
		System.out.println(num + " -> " + colorName);
	}
	
	//�޼ҵ� : �޼ҵ� ������ ����� �����Ѵ�.
	//��ȯ���� �ִ�. ��ȯ���� ������ void, ��ȯ���� �������� ��ȯ�ϴ� ���������� ����Ѵ�.
	//�����ε� : ���� �޼ҵ���� ������ ������ �� �ִ�.
	//		  �Ű������� ������ ���������� �޶����.
	public int getNum() {
		num += 5000;
		return num; //��ȯ���� ������ return�� �Ͽ� �ܺη� �����͸� ��������.
	}
	public int getNum(int value) {
		num += value;
		return num; //��ȯ���� ������ return�� �Ͽ� �ܺη� �����͸� ��������.
	}
	public void setName() {
		name = "�̼���";
		System.out.println("name = " + name);
	}
}
