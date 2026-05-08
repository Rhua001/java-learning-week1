package week2.day13;

public class Rabbit extends Anmimal{
    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
