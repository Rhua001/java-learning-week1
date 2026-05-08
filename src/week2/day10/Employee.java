package week2.day10;

import java.sql.SQLOutput;

public class Employee {
    private String name;
    private int age;
    private double salary;

    //无参构造
    public Employee() {
        this.name = "未知员工";
        this.age = 18;
        this.salary = 5000;
    }

    //全参构造
    public Employee(String name, int age, double salary) {
        this();
        SetName(name);
        SetAge(age);
        SetSalary(salary);
    }

    //其他参构造
    public Employee(String name) {
        this();
        SetName(name);
    }

    public Employee(String name, int age) {
        this(name);
        SetAge(age);
    }

    public Employee(String name, double salary) {
        this(name);
        SetSalary(salary);
    }

    //                  Setter
    public void SetName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("名字无效，保持默认。");
        } else {
            this.name = name;
        }
    }

    public void SetAge(int age) {
        if (age < 16 || age > 65) {
            System.out.println("年龄必须在16到65之间！");
        } else {
            this.age = age;
        }
    }

    public void SetSalary(double salary) {
        if (salary < 0) {
            System.out.println("薪资不能为负！");
        } else {
            this.salary = salary;
        }
    }

    //             Getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    //            展示信息函数
    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age + ",薪资：" + salary);
    }

    //带标题输出
    public void show(String title) {
        System.out.println(title + "-" + "姓名：" + name + ",年龄：" + age + ",薪资：" + salary);
    }


}
