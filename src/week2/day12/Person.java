package week2.day12;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void keepPet(Anmimal a,String something){
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "的" + name + "养了一只年龄为" + d.getAge() + "的" +
                    d.getColor() + "的狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "的" + name + "养了一只年龄为" + c.getAge() + "的" +
                    c.getColor() + "的猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }
}
