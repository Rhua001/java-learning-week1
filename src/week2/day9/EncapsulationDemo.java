package week2.day9;

public class EncapsulationDemo {
    public static void main(String[] args) {
        //有参构建对象
        Student stu1 = new Student("张三", 20, "@12345");
        stu1.print();

        //通过get获取信息
        System.out.println("\n姓名：" + stu1.getName());
        System.out.println("\n年龄：" + stu1.getAge());
        System.out.println("\nQQ号：" + stu1.getQqadress());

        // 通过 setter 修改属性（带校验）
        System.out.println("\n=== 尝试修改年龄 ===");
        stu1.setAge(200);//不合法
        stu1.setAge(25);//合法
        System.out.println("修改后的年龄：" + stu1.getAge());
        System.out.println("\n=== 尝试修改姓名 ===");
        stu1.setName("");
        stu1.setName("张老三");
        System.out.println("修改后的名字：" + stu1.getName());
        System.out.println("\n=== 尝试修改邮箱 ===");
        stu1.setQqadress("12345");
        stu1.setQqadress("@11111");
        System.out.println("修改后的邮箱：" + stu1.getQqadress());

        // 使用无参构造器 + setter
        System.out.println("\n=== 使用无参构造器 + setter 创建对象 ===");
        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(88);
        stu2.setQqadress("@33333");
        stu2.print();

        System.out.println("\n=== 最终所有对象信息 ===");
        stu1.print();
        stu2.print();
    }
}
