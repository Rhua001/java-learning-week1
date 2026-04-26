package week1.day6;

import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("请输入"+size+"个整数（每输入一个回车）：");

        for(int i=0;i<size;i++){
            System.out.print("第"+(i+1)+"个元素：");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("你输入的数组为：");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //计算总和
        int sum = 0;
        for (int i = 0; i <size ; i++) {
            sum += arr[i];
        }
        System.out.println("你输入数组的总和为；"+sum);

        //计算平均数
        double avg = (double) sum/arr.length;
        System.out.println("数组平均数为：" +avg);

        //使用增强for循环
        int sum2 = 0;
        for (int x:arr){
            sum2+=x;
        }
        double avg2 = (double) sum2/arr.length;
        System.out.println("增强for得出总和为："+sum2+",平均数为："+avg2);
    }
}
