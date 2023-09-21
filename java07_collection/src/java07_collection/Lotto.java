package java07_collection;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random(); // ���� ������ ���� ��ü ����
        Scanner sc = new Scanner(System.in);

        while (true)
        {
        	System.out.print("���Ӽ� -> ");
	        int game = sc.nextInt();
	        
	        //***�迭������
	        
	        for (int i = 1; i < game; i++) {
	        	TreeSet<Integer> lotto = new TreeSet<Integer>(); //��ȣ ������ ��ü, �ߺ�����, ����
	        	int ran;
	        	while (true) {
	        		ran = random.nextInt(45) + 1;
	        		lotto.add(ran);
	        		//��ȣ 7�� ������ �ݺ��� �ߴ�
	        		if (lotto.size() >= 7) {
	        			break;
	        		}
	        	}
	        	
	        	//lotto���� ran(���ʽ���ȣ)�� ����
	        	lotto.remove(ran);
	        	
	        	//���
	        	System.out.print(i + "���� = ");
	        	System.out.print(lotto.toString()); //��ȣ
	        	System.out.println(", Bonus = " + ran);//���ʽ�
	        	
	    }


	        	System.out.print("����Ͻðڽ��ϱ�? (1 : ��, 2 : �ƴϿ�) ");
	        	int submit = sc.nextInt();
	        	if(submit == 2) {
	        		break;
	        	}
	        	else {
	        		continue;
	        	}
	  
	        }
	}

}
