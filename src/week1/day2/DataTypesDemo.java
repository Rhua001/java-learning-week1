package week1.day2;

public class DataTypesDemo {
    public static void main(String[] args) {
        //整数类型
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000000L;

        //浮点类型
        float f = 3.14f;
        double d = 3.1415926;

        //字符和布尔
        char c = 'A';
        boolean bool = true;

        //类型转换
        int num1 = 100;
        double num2 = num1;//自动转换
        int num3 = (int) num2;//强制转换

        //常量
        final double PI = 3.14;
    }
}
