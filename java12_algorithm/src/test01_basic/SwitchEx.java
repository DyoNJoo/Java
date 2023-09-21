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
		System.out.println(name + "은 " + grade + "학점 입니다.");
		System.out.println("등급은 " + tier + "입니다.");
	}

}
