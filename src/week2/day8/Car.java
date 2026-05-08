package week2.day8;

public class Car {
    String brand;//品牌名字
    String color;//颜色
    double price;//价格

    //成员方法
    public void start() {
        System.out.println(brand + " " + color + "汽车启动，价格："+price);
    }
    public void stop() {
        System.out.println(brand+"刹车停止！");
    }
    public void accelerate() {
        System.out.println(brand+"正在加速！");
    }
}
