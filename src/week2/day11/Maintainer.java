package week2.day11;

public class Maintainer extends AdminStaff {
    public Maintainer(String name, String id, String work) {
        super(name, id, work);
    }
    public  Maintainer() {}

    @Override
    public void work() {
        System.out.println("编号：" + getId() + "，姓名：" + getName() +
                "，负责工作：" + getWork() + "，正在维护公司设备与环境");
    }
}
