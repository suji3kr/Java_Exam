package ch16.sec02.exam04;

import ch16.sec01.exam06.Skinnable;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
    private int skin; // 스킨 속성

    // 생성자: 이름, 주인 이름, 스킨 색상을 매개변수로 받음
    public SkinnableRobotPet(String name, String masterName, int skin) {
        super(name, masterName); // 수퍼클래스인 RobotPet의 생성자 호출
        this.skin = skin; // 전달받은 스킨 값을 설정
    }

    // 스킨을 변경하는 메서드
    @Override
    public void changSkin(int skin) {
        this.skin = skin; // 새로운 스킨 값을 설정
    }

    // 현재 스킨을 출력하는 메서드
    public void printSkin() {
        // 스킨 색상에 따라 출력
        switch (skin) {
            case BLACK:
                System.out.print("검정"); // 검정색 스킨
                break;
            case RED:
                System.out.print("빨강"); // 빨강색 스킨
                break;
            case GREEN:
                System.out.print("초록"); // 초록색 스킨
                break;
            case BLUE:
                System.out.print("파랑"); // 파랑색 스킨
                break;
            case YELLOW:
                System.out.print("노랑"); // 노랑색 스킨
                break;
        }
    }
}
