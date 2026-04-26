package week1.day4;

public class BranchDemo {
    public static void main(String[] args) {
        //if-else示例
        int score=30;
        if (score>=90){
            System.out.println("优秀");
        } else if (score>=80) {
            System.out.println("良好");
        } else if (score>=60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        //swith-case示例
        int day=9;
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("没有这个日期");
        }
    }
}
