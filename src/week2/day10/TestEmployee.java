package week2.day10;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.show();
        Employee e2 = new Employee("张三",-1.0);
        e2.show("优秀员工");
        Employee e3 = new Employee("李四",0);
        e3.show();
        Employee e4 = new Employee("王五",30,80000.0);
        e4.show();

    }
}
