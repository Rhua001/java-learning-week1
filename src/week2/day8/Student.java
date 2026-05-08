package week2.day8;

public class Student {
    //成员变量
    String name;
    int age;
    String studentID;

    //成员发放
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void display() {
        System.out.println("姓名：" + name + "，年龄：" + age + ",学号:" + studentID);
    }


   /* public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rhua";
        s1.age = 18;
        s1.studentID="123";
        s1.display();
        s1.study();
    }*/

}
