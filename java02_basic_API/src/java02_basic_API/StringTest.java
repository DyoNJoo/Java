package java02_basic_API;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		String username1 = new String("�������");
		String username2 = new String("�������");
		
		int a = 250;
		
		if (name1 == name2) {
			System.out.println("name1�� name2�� ����.");
		}
		else {
			System.out.println("name1�� name2�� �ٸ���.");
		}
		
		if (username1 == username2) {
			System.out.println("username1�� username2�� ����.");
		}
		else {
			System.out.println("username1�� username2�� �ٸ���.");
		}
		
		if (username1.equals(username2)) {
			System.out.println("username1�� username2�� ����.");
		}
		else {
			System.out.println("username1�� username2�� �ٸ���.");
		}
		
		name1 = name1 + "�Դϴ�.";
		name1 = name1 + "���ڿ�Ȯ����";
		
		String str = "Java Programing String Test....";
		System.out.println("charAt() = " + str.charAt(5)); //index�� 5��° ���ڸ� ��ȯ
		System.out.println(str.concat(name1)); //���ڿ��� ����
		
		byte[] ascii = str.getBytes(); //���ڿ��� �ƽ�Ű�ڵ带 ���Ͽ� �迭�� ��ȯ����.
		System.out.println("ascii -> " + Arrays.toString(ascii)); //Arrays.toString() -> �迭 ���� ���
		
		//ã�� ���ڰ� ������ -1
		System.out.println("indexOf -> " + str.indexOf("a")); //ó�������� ������ġ index
		System.out.println("lastIndexOf -> " + str.lastIndexOf("a")); //�ڿ��� ó�������� ������ġ index (�����ʺ��� ��)
		System.out.println("indexOf -> " + str.indexOf("z"));
		
		System.out.println("length -> " + str.length());
		
		//����ġȯ a -> ����
		String str2 = str.replaceAll("a", "����");
		System.out.println("replaceAll() -> " + str2);
		
		String tel = "010-1234-5678";
		String phone[] = tel.split("-"); // 0 -> 010, 1 -> 1234, 2 -> 5678
		for (String p: phone) {
			System.out.println(p);
		}
		
		//��ҹ��� ��ȯ
		System.out.println(str.toLowerCase() + ", " + str.toUpperCase());
		
		//�Ϻι��ڿ� ������
		System.out.println("substring -> " + str.substring(7)); //index 7�� ��ġ���� �������� ���ڿ��� ���Ѵ�.
		System.out.println("substring -> " + str.substring(7, 12)); //ù��° index���� �ι�° index �չ��ڱ���
		
		//������ ���鹮�ڸ� �����.
		String txt = "     �ڹ����α׷���          ";
		System.out.println("trim -> " + txt.trim() + "*");
		
		//���ڿ��� �� : equals() -> ��ҹ��� ����, equalsIgnoreCase() -> ��ҹ��� ���� X
		String data1 = "JAVA"; // A - 65
		String data2 = "James"; // a - 97
		// 65 - 97 = -32
		
		System.out.println("equals -> " + data1.equals(data2));
		System.out.println("equalsIgnoreCase -> " + data1.equalsIgnoreCase(data2));
		
		//���ڿ��� ũ��� : compareTo() -> ��ҹ��� ������, compareToIngnoreCase() -> ��ҹ��� ��������.
		// ��� -�̸� �������� ������ ���ڿ��� ũ��.
		//	   +�̸� �������� ������ ���ڿ��� �۴�.
		//	   0�̸� ����.
		System.out.println("compareTo() -> " + data1.compareTo(data2));
		if (data1.compareTo(data2) > 0) {
			System.out.println("data1�� ũ��.");
		}
		else if (data1.compareTo(data2) < 0){
			System.out.println("data2�� ũ��.");
		}
		else {
			System.out.println("����.");
		}
		
		int num = 1234;
		String result = num + "";
		String result2 = String.valueOf(num); // "1234"
		
		char[] charArr = { '��', 'ü', '��', '��' }; // "��ü����"
		System.out.println("charArr -> " + String.valueOf(charArr));
		
		System.out.println("compareToIngnoreCase() -> " + data1.compareToIgnoreCase(data2));
		
	}

}
