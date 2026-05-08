package week2.day14;

public class a1sportTest {
    public static void main(String[] args) {
        PingPongSporter p1 = new PingPongSporter("马龙",23);
        System.out.println(p1.getName()+" "+p1.getAge());
        p1.speakEnglish();
        p1.study();

        BasketballCoach coach = new BasketballCoach();
        coach.setName("姚明");
        coach.setAge(30);
        coach.teach();
    }
}
