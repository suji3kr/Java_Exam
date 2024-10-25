package ch16.sec02.exam05;

import ch16.sec01.exam01.Wearable;
import ch16.sec01.exam06.Skinnable;


public class HeadMountedDisplayTester {
    public static void main(String[] args) {
        HeadMountedDisplay hmd = new HeadMountedDisplay();
        hmd.putOn();    //착용
        hmd.putOff();   //해제
        hmd.changSkin(Skinnable.YELLOW);    //스킨변경
        hmd.putSkin();      //스킨표시

        Wearable w = hmd;
        w.putOn();  //착용
        w.putOff();  //해제

        Skinnable s = hmd;
        s.changSkin(Skinnable.BLACK);       //스킨변경

        hmd.putSkin();   //스킨표시
    }
}
