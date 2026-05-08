package week2.day14;

import java.sql.SQLOutput;

public class PingPongCoach extends Coach implements English{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getName()+"是乒乓球教练,在教学员打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println(this.getName()+"是乒乓球教练,在说英语");
    }
}
