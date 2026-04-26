package week1.day2;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI=3.14;

        Scanner sc=new Scanner(System.in);
        System.out.print("请输入圆的半径： ");
        double r=sc.nextDouble();

        //计算面积
        double area=PI*r*r;

        //保留两位小数
        System.out.printf("半径为%.2f的圆面积为：%.2f%n",r,area);

        sc.close();
    }
}
