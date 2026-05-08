package week2.day13;

public class Frog extends Anmimal implements Swim {
    @Override
    public void swim(){
        System.out.println("青蛙蛙泳");
    }
    @Override
    public void eat(){
        System.out.println("青蛙吃虫子");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
