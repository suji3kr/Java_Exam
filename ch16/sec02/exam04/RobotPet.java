package ch16.sec02.exam04;

public class RobotPet extends Pet {
    // 생성자: 이름과 주인 이름을 매개변수로 받음
    public RobotPet(String name, String masterName) {
        super(name, masterName); // 수퍼클래스인 Pet의 생성자 호출
    }

    // 자기소개 메서드
    public void introduce() {
        // 로봇의 이름과 주인 이름을 출력
        System.out.println("○ 나는 로봇입니다_ 이름은 " + getName() + ".");
        System.out.println("○ 주인님의 이름은 " + getMasterName() + ".");
    }

    // 가사일 수행 메서드
    public void work(int sw) {
        // sw 값에 따라 수행할 작업을 결정
        switch (sw) {
            case 0:
                System.out.println("청소를 합니다."); // 청소 작업
                break;
            case 1:
                System.out.println("세탁을 합니다."); // 세탁 작업
                break;
            case 2:
                System.out.println("밥을 합니다."); // 밥 준비 작업
                break;
            default:
                System.out.println("알 수 없는 작업입니다."); // 알 수 없는 작업 처리
        }
    }
}
