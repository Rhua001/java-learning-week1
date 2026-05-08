package week2.day8;

public class CarTest {
    public static void main(String[] args) {
        //创建对象
        Car c1 = new Car();
        c1.brand="宝马";
        c1.color="白色";
        c1.price=45.5;

        //第二个对象
        Car c2 = new Car();
        c2.brand="特斯拉";
        c2.color="黑色";
        c2.price=100;

        //调用方法
        System.out.println("=== 第一辆车 ===");
        c1.start();
        c1.accelerate();
        c1.stop();
        System.out.println();

        //调用第二辆车
        System.out.println("=== 第二辆车 ===");
        c2.start();
        c2.accelerate();
        c2.stop();
    }
}
