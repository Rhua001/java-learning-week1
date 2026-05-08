package week2.day12;

public class Cat extends Anmimal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫在吃"+something);
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡");
    }

    public void catchmouse(){
        System.out.println("猫抓老鼠");
    }


}
