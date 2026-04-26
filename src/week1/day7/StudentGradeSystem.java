package week1.day7;

import com.sun.source.tree.ContinueTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // 显示主菜单
            System.out.println("\n===== 学生成绩录入系统 =====");
            System.out.println("1. 录入新班级");
            System.out.println("0. 退出系统");
            System.out.print("请输入你的选择: ");
            // 菜单输入也做异常保护
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请输入数字！");
                input.nextLine();
                choice = -1;
                continue;
            }
            if (choice == 1) {
                processclass(input);
            } else if (choice == 0) {
                System.out.println("感谢使用，再见！");
            } else {
                System.out.println("无效选项，请重新输入！");
            }
        } while (choice != 0);
        input.close();
    }

    // 成绩录入函数
    public static void processclass(Scanner input) {
        System.out.print("请输入班级人数：");
        int studentCount = 0;
        while (true) {
            try {
                studentCount = input.nextInt();
                if (studentCount < 0) {
                    System.out.println("人数不能为负数，请重新输入：");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("输入无效，请输入正整数");
                input.nextLine();
            }
        }

        String[] names = new String[studentCount];
        double[] grades = new double[studentCount];
        //开始录入成绩
        System.out.println("\n--- 开始录入成绩 ---");

        for (int i = 0; i < studentCount; i++) {
            System.out.print("请输入第" + (i + 1) + "个同学的名字是：");
            names[i] = input.next();
            //防止成绩输入异常
            while (true) {
                System.out.print("请输入第" + (names[i]) + "个同学的成绩(0~100)：");
                try {
                    double grade = input.nextDouble();
                    if (grade < 0 || grade > 100) {
                        System.out.print("输入错误，成绩在0~100，请重新输入：");
                        continue;
                    }
                    grades[i] = grade;
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("输入错误，请输入0~100的整数：");
                    input.nextLine();//清空缓冲区
                }
            }
        }
        printresult(names, grades);
    }

    //输出结果函数
    public static void printresult(String[] names, double[] grades) {
        int n = grades.length;
        double sum = 0.0;
        double max = grades[0];
        double min = grades[0];
        int maxIdx = 0;
        int minIdx = 0;
        //记录各分段人数
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            sum += grades[i];
            if (grades[i] > max) {
                max = grades[i];
                maxIdx = i;
            }
            if (grades[i] < min) {
                min = grades[i];
                minIdx = i;
            }
            //等级判断
            if (grades[i] >= 90) {
                a++;
            } else if (grades[i] >= 80) {
                b++;
            } else if (grades[i] >= 60) {
                c++;
            } else {
                d++;
            }

        }
        double avg = sum / n;

        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║         📊 成绩统计结果          ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.printf("║ 平均分: %-20.2f ║\n", avg);
        System.out.printf("║ 最高分: %-10s — %-5.1f  ║\n", names[maxIdx], max);
        System.out.printf("║ 最低分: %-10s — %-5.1f  ║\n", names[minIdx], min);
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║          📈 成绩分布             ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.printf("║ 优秀(90-100): %-12d人  ║\n", a);
        System.out.printf("║ 良好(80-89):  %-12d人  ║\n", b);
        System.out.printf("║ 及格(60-79):  %-12d人  ║\n", c);
        System.out.printf("║ 不及格(0-59): %-12d人  ║\n", d);
        System.out.println("╚══════════════════════════════════╝");

        // ===== 成绩排名（降序） =====
        System.out.println("\n📋 成绩排名（从高到低）:");
        // 创建索引数组，用于排序
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }
        //冒泡排序,只给名字分数前标上排名
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (grades[numbers[j]] < grades[numbers[j + 1]]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }
        }
        // 打印排名表，按照排名打印名字成绩
        System.out.println("┌─────┬──────────┬───────┐");
        System.out.println("│ 名次 │  姓名    │ 成绩  │");
        System.out.println("├─────┼──────────┼───────┤");
        for (int i = 0; i < n; i++) {
            int rank = numbers[i];
            System.out.printf("│ %-3d │ %-8s │ %5.1f │\n", i + 1, names[rank], grades[rank]);
        }
        System.out.println("└─────┴──────────┴───────┘");
    }
}
