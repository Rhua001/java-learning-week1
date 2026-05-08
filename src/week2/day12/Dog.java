package week2.day12;

public class Dog extends Anmimal{
    @Override
    public void sleep() {
        System.out.println("狗躺着睡");
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗在吃"+something);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
