package week1.day4;

import java.util.Scanner;

//简易计算机，进行+、-、*、/四种运算
public class Calculator {
    public static void main(String[] args) {
        System.out.println("欢迎来到R滑的算术机");
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个数字：");
        double num1 = sc.nextDouble();

        System.out.print("请输入运算符：");
        char operator = sc.next().charAt(0);//读取单个字符

        System.out.print("请输入第二个数字：");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean valid = true;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    valid = false;
                    System.out.println("错误，除数不能为0");
                    result = 0;
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                valid = false;
                System.out.println("错误，不支持该运算符，请使用+、-、*、/");
                break;
        }
        if (valid) {
            System.out.printf("结果：%.2f %c %.2f=%.2f\n", num1, operator, num2, result);
        }
        sc.close();
    }
}
