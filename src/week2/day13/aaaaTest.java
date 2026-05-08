package week2.day13;

public class aaaaTest {
    public static void main(String[] args) {
        Frog frog = new Frog("小青",2);
        Dog dog =  new Dog("周周",5);
        Rabbit r = new Rabbit("小白",4);

        System.out.println(frog.getName()+" "+frog.getAge());
        frog.eat();
        frog.swim();

        System.out.println(r.getName()+" "+r.getAge());
        r.eat();
    }
}
