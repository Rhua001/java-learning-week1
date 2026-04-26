package week1.day3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        boolean isleep = (year%400==0) || (year%4==0 && year%100!=0);
        if(isleep){
            System.out.println(year + "年是闰年！");
        }else {
            System.out.println(year + "年不是润年！");
        }
        sc.close();
    }
}
