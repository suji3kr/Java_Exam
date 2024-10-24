package ch16.sec02.exam04;

import ch16.sec01.exam06.Skinnable;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
    private int skin;       //스킨


    //생성자
    public SkinnableRobotPet(String name, String masterName, int skin) {
        super(name, masterName);            //수퍼클래스의 생성자
        this.skin = skin;
    }


    @Override
    public void changSkin(int skin) {
        this.skin = skin;
    }//현재의 스킨을 표시

    public void printSkin() {
        switch (skin) {
            case BLACK:
                System.out.print("검정");
                break;
            case RED:
                System.out.print("빨강");
                break;
            case GREEN:
                System.out.print("초록");
                break;
            case BLUE:
                System.out.print("파랑");
                break;
            case YELLOW:
                System.out.print("노랑");
                break;
        }

    }

}
