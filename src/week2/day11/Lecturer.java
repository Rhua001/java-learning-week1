package week2.day11;

public class Lecturer extends Teacher{
    public Lecturer(String name, String id, String work){
        super(name, id, work);
    }
    public Lecturer(){}

    //讲师讲课
    @Override
    public void work() {
        System.out.println("编号：" + getId() + "，姓名: " + getName() +
                "，负责工作: " + getWork() + "，正在讲课");
    }
}
