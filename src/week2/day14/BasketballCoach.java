package week2.day14;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getName()+"是篮球教练,在教学生打篮球");
    }
}
