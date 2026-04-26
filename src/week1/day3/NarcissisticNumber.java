package week1.day3;

import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个100到999的数字：");

        int numble = sc.nextInt();
        //检查是否为三位数
        if (numble < 100 || numble > 999) {
            System.out.println("输入错误，请重新输入100到999的数字");
            sc.close();
            return;
        }

        int hundred = numble / 100;//百位
        int ten = numble % 100 / 10;//十位
        int one = numble % 10;//个位

        //计算立方和
        int sum=hundred*hundred*hundred
                +ten*ten*ten
                +one*one*one;

        //判断是否为水仙花数
        if (sum==numble) {
            System.out.println(numble+"是水仙花数！");
        }else {
            System.out.println(numble+"不是水仙花数。");
        }
        sc.close();
    }
}
