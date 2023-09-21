import java.util.*;

public class ArrayEx04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수 = ");
        int num = sc.nextInt();

        int[] totalScore = new int[num]; // 각 학생의 총점을 저장할 배열
        int[] subjectTotal = new int[3]; // 각 과목별 총점을 저장할 배열 (국어, 영어, 수학 순서)

        String student[][] = new String[num][7];

        for (int i = 0; i < num; i++) {
            int sum = 0;
            int avg = 0;
            System.out.print("학생이름 = ");
            String name = sc.next();

            System.out.print("국어 = ");
            int kor = sc.nextInt();
            System.out.print("영어 = ");
            int eng = sc.nextInt();
            System.out.print("수학 = ");
            int math = sc.nextInt();

            sum = kor + eng + math;
            avg = sum / 3;

            totalScore[i] = sum; // 각 학생의 총점을 저장합니다.
            subjectTotal[0] += kor; // 국어 점수를 과목별 총점에 더합니다.
            subjectTotal[1] += eng; // 영어 점수를 과목별 총점에 더합니다.
            subjectTotal[2] += math; // 수학 점수를 과목별 총점에 더합니다.

            student[i][0] = name;
            student[i][1] = String.valueOf(kor);
            student[i][2] = String.valueOf(eng);
            student[i][3] = String.valueOf(math);
            student[i][4] = String.valueOf(sum);
            student[i][5] = String.valueOf(avg);
        }

        System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t석차\n");

        for (int i = 0; i < num; i++) {
            System.out.println(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2]
                    + "\t" + student[i][3] + "\t" + student[i][4] + "\t" + student[i][5]);
        }

        System.out.print("총점\t");
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.print(subjectTotal[i] + "\t");
        }
        
        System.out.println();
        
        System.out.print("평균\t");
        for (int i = 0; i < subjectTotal.length; i++) {
            int avg = subjectTotal[i] / num;
            System.out.printf("%d\t", avg);
        }
    }
}
