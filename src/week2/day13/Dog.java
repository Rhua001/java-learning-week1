package week2.day13;

public class Dog extends Anmimal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨游泳");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
