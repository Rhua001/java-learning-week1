package week1.day3;

public class OperatorsDemo {
    public static void main(String[] args) {
        //算术运算符
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //关系运算符
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        //逻辑运算符
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));

        //三元运算符
        int max = (a > b) ? a : b;
        System.out.println("max=" + max);
    }
}
