import java.util.*;

public class Lotto {

    public static void main(String[] args) {
        Random random = new Random(); // ���� ������ ���� ��ü ����
        Scanner sc = new Scanner(System.in);
        int number[] = new int[6];
        Arrays.sort(number);

        while (true) {
            System.out.print("���Ӽ� = ");
            int game = sc.nextInt();
            
            for (int i = 0; i < game; i++) {
                // �� ���Ӹ��� ���ο� ��ȣ�� �����ؾ� ��
                for (int j = 0; j < number.length; j++) {
                    number[j] = random.nextInt(45) + 1;
                    for(int k = 0; k < j; k++) {
						if(number[j] == number[k]) {
							j--;
							break;
						}
					}
                }
                
                //����� ���ڸ� ��������
                Arrays.sort(number);

                System.out.printf("%d���� = [", i + 1);
                for (int j = 0; j < number.length; j++) {
	                System.out.printf("%d", number[j]);
	                if (j < number.length - 1) {
	                    System.out.printf(", ");
	                }
                }
                System.out.printf("], ");
                System.out.printf("bonus = %d\n", random.nextInt(45) + 1);
            }
            System.out.print("����Ͻðڽ��ϱ�? (1 : ��, 2 : �ƴϿ�) ");
            int submit = sc.nextInt(); {
            	if (submit == 1) {
            		continue;
            	}
            	else {
            		break;
            	}
            }
        }
    }
}
