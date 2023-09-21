import java.util.*;

public class CalenderEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		System.out.print("�⵵ = ");
		int year = sc.nextInt();
		System.out.print("�� = ");
		int month = sc.nextInt();
		
		System.out.printf("\t\t\t%d�� %d��\n", year, month);
	    System.out.printf("��\t��\tȭ\t��\t��\t��\t��\n");
	   
	    date.set(year, month - 1, 1); //��ü�� �⵵�� ���� ����
	    // month - 1�� �ϴ� ������ -1�� ����� �ش� ���� �ν��ϱ� �����̴�.
	    
	    int day = date.get(Calendar.DAY_OF_WEEK); //�Ͽ���(1)���� �����(7)������ ���� ������.
	    
	    for (int i = 1; i < day; i++) {
	    	System.out.printf("\t");
	    }
	    
	    for (int i = 1; i <= date.getActualMaximum(Calendar.DATE); i++) {
	    	System.out.printf("%d\t", i);
	    	if (day % 7 == 0) {
	    		System.out.println();
	    	}
	    	day++;
	    }
	}
}