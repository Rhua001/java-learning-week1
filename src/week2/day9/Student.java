package week2.day9;

public class Student {
    private String name;
    private int age;
    private String qqadress;

    //无参
    public Student(){}
    //有参
    public Student(String name, int age, String qqadress) {
        this.name=name;
        setAge(age);
        setQqadress(qqadress);
    }
    //Getter方法
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getQqadress(){
        return qqadress;
    }
    //Setter方法
    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            System.out.println("姓名不能为空，设置失败。");
            return;
        }
        this.name=name;
    }
    public void setAge(int age){
        //校验合法
        if(age>=0&&age<=100){
            this.age=age;
        }else {
            System.out.println("年龄不合法！");
        }
    }
    public void setQqadress(String qqadress){
        if(qqadress == null || qqadress.trim().isEmpty()||!qqadress.contains("@")){
            System.out.println("邮箱不合法，必须带有“@”！");
            return;
        }
        this.qqadress=qqadress;
    }
    // 成员方法（展示信息）
    public void print(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，QQ号：" +  qqadress);
    }
}
