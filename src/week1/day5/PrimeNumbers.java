package week1.day5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1：判断是否为素数");
        System.out.println("2:打印一个区间内所有素数");
        System.out.print("请选择1或2：");
        int opinion = input.nextInt();

        if (opinion==1){
            System.out.println("请输入需要判断的数字");
            int num = input.nextInt();
            if (isPrime(num)){
                System.out.println(num + "是素数");
            }else System.out.println(num + "不是素数");
        } else if (opinion==2) {
            System.out.print("请输入起始数字：");
            int start = input.nextInt();

            System.out.print("请输入结束数字");
            int end = input.nextInt();

            System.out.println("区间["+ start+","+end+"]内的素数有：");
            boolean found = false;
            for (int i=start; i<=end; i++){
                if (isPrime(i)){
                    System.out.print(i+" ");
                    found = true;
                }
            }
            if (!found){
                System.out.println("没有素数！");
            }else {
                System.out.println();
            }
        }else {
            System.out.println("无效输入，请输入1或2：");
        }
        input.close();
    }
    public static boolean isPrime(int n){
        if (n<=1) return false;
        if (n==2) return true;
        for (int i=2; i*i<=n; i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
