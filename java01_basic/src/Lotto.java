import java.util.*;

public class Lotto {

    public static void main(String[] args) {
        Random random = new Random(); // 난수 생성을 위한 객체 선언
        Scanner sc = new Scanner(System.in);
        int number[] = new int[6];
        Arrays.sort(number);

        while (true) {
            System.out.print("게임수 = ");
            int game = sc.nextInt();
            
            for (int i = 0; i < game; i++) {
                // 각 게임마다 새로운 번호를 생성해야 함
                for (int j = 0; j < number.length; j++) {
                    number[j] = random.nextInt(45) + 1;
                    for(int k = 0; k < j; k++) {
						if(number[j] == number[k]) {
							j--;
							break;
						}
					}
                }
                
                //저장된 숫자를 오름차순
                Arrays.sort(number);

                System.out.printf("%d게임 = [", i + 1);
                for (int j = 0; j < number.length; j++) {
	                System.out.printf("%d", number[j]);
	                if (j < number.length - 1) {
	                    System.out.printf(", ");
	                }
                }
                System.out.printf("], ");
                System.out.printf("bonus = %d\n", random.nextInt(45) + 1);
            }
            System.out.print("계속하시겠습니까? (1 : 예, 2 : 아니오) ");
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
