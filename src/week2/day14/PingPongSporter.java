package week2.day14;

public class PingPongSporter extends Sporter implements English{
    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println(this.getName()+"是兵乓球运动员,正在说英语");
    }

    @Override
    public void study() {
        System.out.println(this.getName()+"正在学习打乒乓球");
    }
}
