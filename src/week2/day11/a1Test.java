package week2.day11;

public class a1Test {
    public static void main(String[] args) {
        //先创造子类
        Lecturer l1 = new Lecturer("李老师","B001","Java基础教学");
        Tutor t1=new Tutor();

        t1.setName("张助教");
        t1.setId("B002");
        t1.setWork("查明问题");

        Maintainer m1=new Maintainer("王专员", "A001", "校区设备维护");
        Buyer b1=new Buyer("赵专员", "A002", "办公用品采购");


        //调用各自工作
        l1.work();
        m1.work();
        b1.work();
        t1.work();
    }
}
