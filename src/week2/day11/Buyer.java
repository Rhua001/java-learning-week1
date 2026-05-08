package week2.day11;

public class Buyer extends AdminStaff{
    public Buyer(String name, String id, String work) {
        super(name, id, work);
    }
    public Buyer(){}

    @Override
    public void work() {
        System.out.println("编号：" + getId() + "，姓名：" + getName() +
                "，负责工作：" + getWork() + "，正在采购公司所需物资");
    }
}
