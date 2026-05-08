package week2.day10;

import com.sun.source.tree.WhileLoopTree;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("奥特曼", 100);
        Role r2 = new Role("怪兽", 100);

        //回合制游戏
        while (true) {
            r1.attract(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }
            r2.attract(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}
