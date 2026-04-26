package week1.day2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("温度转换器");
        System.out.println("1.华氏->摄氏度");
        System.out.println("2.摄氏度->华氏");
        System.out.print("请选择转换方向（1或2）： ");
        int chioce = sc.nextInt();

        if(chioce == 1){
            //华氏转摄氏度
            System.out.print("请输入华氏度：");
            double huashi = sc.nextDouble();
            //计算
            double sheshi = (huashi-32)*5.0/9.0;
            System.out.printf("%.2fF = %.2fC",huashi,sheshi);
        }
        else if(chioce == 2){
            //摄氏度->华氏
            System.out.print("请输入摄氏度：");
            double sheshi = sc.nextDouble();
            //计算
            double huashi = sheshi*5.0/9.0+32;
            System.out.printf("%.2fC = %.2fF",sheshi,huashi);
        }else {
            System.out.println("输入错误，请输入1或2。");
        }
        sc.close();
    }
}
