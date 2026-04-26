package week1.day5;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入金字塔行数:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows ; i++) {
            //打印空格使居中
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print(" ");
            }
            //打印形状
            for (int k = 1; k <= 2*i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
