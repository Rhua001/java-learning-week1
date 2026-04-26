package week1.day4;

import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数:");
        double score = sc.nextDouble();

        //检查分数是否合法
        if(score<1||score>100) {
            System.out.println("错误，成绩必须在0-100间！");
        }else {
            char grade;
            if (score >= 90){
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else  {
                grade = 'F';
            }
            System.out.printf("成绩%.1f的等级为:%c\n",score,grade);
        }
        sc.close();
    }
}
