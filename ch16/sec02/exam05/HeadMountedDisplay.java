package ch16.sec02.exam05;

import ch16.sec01.exam01.Wearable;
import ch16.sec01.exam06.Skinnable;

public class HeadMountedDisplay implements Wearable, Skinnable {
    private int skin;
    //스킨

    //착용

    @Override
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }
    //해제

    @Override
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }
    //스킨변경

    @Override
    public void changSkin(int skin) {
        this.skin= skin;
    }

    //현재스킨 표시
    public void putSkin(){
        switch (skin){
            case BLACK: System.out.println("BLACK DISPLAY");    break;
            case RED: System.out.println("RED DISPLAY");    break;
            case GREEN: System.out.println("GREEN DISPLAY");    break;
            case BLUE: System.out.println("BLUE DISPLAY");    break;
            case YELLOW: System.out.println("YELLOW DISPLAY");    break;
        }
    }
}
