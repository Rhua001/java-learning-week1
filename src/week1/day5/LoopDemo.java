package week1.day5;

import java.util.concurrent.ForkJoinPool;

//循环结构练习
public class LoopDemo {
    public static void main(String[] args) {
        //for循环--九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }

        //while循环，计算1到100的和
        int sum = 0, n = 1;
        while (n <= 100) {
            sum += n;
            n++;
        }
        System.out.println("1到100的和为：" + sum);

        //do-while循环练习
        int count=0;
        do {
            System.out.println("执行第"+(count+1)+"次");
            count++;
        }while (count<3);
    }
}
