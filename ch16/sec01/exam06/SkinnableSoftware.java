package ch16.sec01.exam06;

public class SkinnableSoftware implements Skinnable {
    int skin; // 스킨 속성

    // 기본 생성자: 스킨을 BLACK으로 초기화
    public SkinnableSoftware() {
        this.skin = BLACK; // 기본 스킨 색상 설정
    }

    // 특정 스킨 색상을 매개변수로 받는 생성자
    public SkinnableSoftware(int skin) {
        this.skin = skin; // 전달받은 스킨 색상으로 초기화
    }

    // 스킨 변경 메서드
    @Override
    public void changSkin(int skin) {
        this.skin = skin; // 새로운 스킨 색상으로 변경
    }

    // 현재 스킨 색상을 반환하는 메서드
    public int getSkin() {
        return skin; // 현재 스킨 색상 반환
    }

    // 현재 스킨 색상의 문자열 표현을 반환하는 메서드
    public String getSkinString() {
        // 스킨 색상에 따라 문자열 반환
        switch (skin) {
            case BLACK:
                return "BLACK";
             // 검정색
            case RED:
                return "RED";
              // 빨강색
            case GREEN:
                return "GREEN";
             // 초록색
            case BLUE:
                return "BLUE";
             // 파랑색
            case YELLOW:
                return "YELLOW";
            //
        }
        return "";
    }
}
