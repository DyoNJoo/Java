
public class Array04 {

	public static void main(String[] args) {
		//���� for��
		//index�� ������� �ʰ�
		
		
		int[] scores = { 89, 23, 58, 98, 78, 45 };
		
		int total = 0;
		for ( int s : scores ) {
			total += s;
		}
		
		System.out.println("total = " + total);
		

	}

}
