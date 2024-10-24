package ch16.sec1.exam01;

import ch16.sec01.exam01.Headphone;
import ch16.sec01.exam01.Wearable;
import ch16.sec01.exam01.WearableComputer;

public class WearableTester {
    public static void main(String[] args) {
        Wearable[]a = new Wearable[2];
        a[0] = new Headphone();             //헤드폰
        a[1] = new WearableComputer();

        for (int i= 0; i< a.length; i++)
            a[i].putOn();

        for (int i= 0; i< a.length; i++)
            a[i].putOff();


    }
}
