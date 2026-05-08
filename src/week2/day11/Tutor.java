package week2.day11;

public class Tutor extends Teacher{
    public Tutor(String name, String id, String work) {
        super(name, id, work);
    }
    public Tutor(){}

    @Override
    public void work() {
        System.out.println("编号：" + getId() + "，姓名: " + getName() +
                "，负责工作: " + getWork() + "，正在辅导学员，批改作业。");
    }
}
