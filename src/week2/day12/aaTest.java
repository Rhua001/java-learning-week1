package week2.day12;
//多态
public class aaTest {
    public static void main(String[] args) {
        Person person = new Person("小华",16);
        Dog d =  new Dog(4,"白色");
        Cat c = new Cat(5,"黄色");
        person.keepPet(d,"骨头");
        person.keepPet(c,"鱼");

        //测试抽象方法
        d.sleep();
        c.sleep();
    }
}
