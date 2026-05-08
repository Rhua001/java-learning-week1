package week2.day10;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {}
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击函数
    public void attract(Role role) {
        //计算伤害
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        //计算剩下的血量
        int reblood = role.getBlood()-hurt;
        //判断一下血量是否合法
        reblood = reblood < 0 ? 0 : reblood;
        role.setBlood(reblood);
        System.out.println(this.getName()+"打了"+role.getName()+"一下，造成了"+hurt+"伤害,"
                +role.getName()+"的血还剩下"+reblood+"。");

    }
}
