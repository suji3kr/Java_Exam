package ch16.sec01.exam01;

public class Headphone implements ch16.sec01.exam01.Wearable {
    int volume = 0; // 볼륨 초기값 설정

    // 헤드폰 착용 메서드
    @Override
    public void putOn() {
        System.out.println("헤드폰을 착용했습니다."); // 착용 메시지 출력
    }

    // 헤드폰 벗는 메서드
    @Override
    public void putOff() {
        System.out.println("헤드폰을 벗었습니다."); // 벗는 메시지 출력
    }

    // 볼륨 설정 메서드
    public void setVolume(int volume) {
        this.volume = volume; // 전달받은 볼륨 값으로 설정
        System.out.println("볼륨을 " + volume + "로 변경했습니다."); // 볼륨 변경 메시지 출력
    }
}

