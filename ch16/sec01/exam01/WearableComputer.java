package ch16.sec01.exam01;

public class WearableComputer implements Wearable {
    public void putOn(){
        System.out.println("컴퓨터를 실행했습니다.");
    }
    public void putOff(){
        System.out.println("컴퓨터를 껏습니다.");
    }
    public void reset(){
        System.out.println("컴퓨터를 재시작했습니다.");
    }
}
