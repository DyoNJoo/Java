package test01_basic;

public class SwitchEx {

	public static void main(String[] args) {
		String name = args[0];
		char grade = args[1].charAt(0);
		String tier = "";
		
		switch (grade) {
		case 'A':
			tier = "Gold";
			break;
		case 'B':
		case 'C':
			tier = "Silver"; 
			break;
		case 'D':
			tier = "Bronze";
			break;
		}
		System.out.println(name + "�� " + grade + "���� �Դϴ�.");
		System.out.println("����� " + tier + "�Դϴ�.");
	}

}
