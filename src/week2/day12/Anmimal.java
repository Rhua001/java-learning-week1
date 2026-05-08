package week2.day12;

public abstract class Anmimal {
    private int age;
    private String color;

    public Anmimal() {
    }

    public Anmimal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String something){
        System.out.println("动物在吃"+something);
    }

    //抽象类
    public abstract void sleep();
}
