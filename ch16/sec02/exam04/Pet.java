package ch16.sec02.exam04;

public class Pet {
    private String name; // 애완견 이름
    private String masterName; // 주인 이름

    // 생성자: 애완견 이름과 주인 이름을 매개변수로 받음
    public Pet(String name, String masterName) {
        this.name = name; // 애완견 이름 설정
        this.masterName = masterName; // 주인 이름 설정
    }

    // 애완견 이름을 반환하는 메서드
    public String getName() {
        return name; // 설정된 애완견 이름 반환
    }

    // 주인 이름을 반환하는 메서드
    public String getMasterName() {
        return masterName; // 설정된 주인 이름 반환
    }

    // 자기소개 메서드
    public void introduce() {
        // 애완견 이름과 주인 이름을 출력
        System.out.println("■ 나의 이름은 " + name + "입니다.");
        System.out.println("■ 주인님의 이름은 " + masterName + "입니다.");
    }
}
