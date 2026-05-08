package week2.day11;

public class Employee {
    private String name;
    private String id;
    private String work;


    public Employee() {}

    public Employee(String name, String id, String work) {
        this.name = name;
        this.id = id;
        this.work = work;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getWork() {
        return work;
    }


    public void setWork(String work) {
        this.work = work;
    }

    public void work(){
        System.out.println("员工正在工作。");
    }
}
