package ch16.sec01.exam01;

public class Headphone implements ch16.sec01.exam01.Wearable {
    int volume =0; //볼륨


    @Override
    public void putOn() {
        System.out.println("헤드폰을 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("헤드폰을 벗었습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 " +volume+ "로 변경했습니다.");
    }
}
