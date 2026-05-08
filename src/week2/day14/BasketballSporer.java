package week2.day14;

import java.sql.SQLOutput;

public class BasketballSporer extends Sporter{
    public BasketballSporer() {
    }

    public BasketballSporer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(this.getName()+"是篮球运动员,在学打篮球");
    }
}
