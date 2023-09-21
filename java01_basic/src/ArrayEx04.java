import java.util.*;

public class ArrayEx04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�л��� = ");
        int num = sc.nextInt();

        int[] totalScore = new int[num]; // �� �л��� ������ ������ �迭
        int[] subjectTotal = new int[3]; // �� ���� ������ ������ �迭 (����, ����, ���� ����)

        String student[][] = new String[num][7];

        for (int i = 0; i < num; i++) {
            int sum = 0;
            int avg = 0;
            System.out.print("�л��̸� = ");
            String name = sc.next();

            System.out.print("���� = ");
            int kor = sc.nextInt();
            System.out.print("���� = ");
            int eng = sc.nextInt();
            System.out.print("���� = ");
            int math = sc.nextInt();

            sum = kor + eng + math;
            avg = sum / 3;

            totalScore[i] = sum; // �� �л��� ������ �����մϴ�.
            subjectTotal[0] += kor; // ���� ������ ���� ������ ���մϴ�.
            subjectTotal[1] += eng; // ���� ������ ���� ������ ���մϴ�.
            subjectTotal[2] += math; // ���� ������ ���� ������ ���մϴ�.

            student[i][0] = name;
            student[i][1] = String.valueOf(kor);
            student[i][2] = String.valueOf(eng);
            student[i][3] = String.valueOf(math);
            student[i][4] = String.valueOf(sum);
            student[i][5] = String.valueOf(avg);
        }

        System.out.printf("�̸�\t����\t����\t����\t����\t���\t����\n");

        for (int i = 0; i < num; i++) {
            System.out.println(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2]
                    + "\t" + student[i][3] + "\t" + student[i][4] + "\t" + student[i][5]);
        }

        System.out.print("����\t");
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.print(subjectTotal[i] + "\t");
        }
        
        System.out.println();
        
        System.out.print("���\t");
        for (int i = 0; i < subjectTotal.length; i++) {
            int avg = subjectTotal[i] / num;
            System.out.printf("%d\t", avg);
        }
    }
}
