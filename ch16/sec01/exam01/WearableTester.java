package ch16.sec1.exam01;

import ch16.sec01.exam01.Headphone;
import ch16.sec01.exam01.Wearable;
import ch16.sec01.exam01.WearableComputer;

public class WearableTester {
    public static void main(String[] args) {
        // Wearable 인터페이스를 구현한 객체를 저장할 배열 생성
        Wearable[] a = new Wearable[2];

        // 배열의 첫 번째 요소에 Headphone 객체 할당
        a[0] = new Headphone(); // 헤드폰 생성
        // 배열의 두 번째 요소에 WearableComputer 객체 할당
        a[1] = new WearableComputer(); // 웨어러블 컴퓨터 생성

        // 각 Wearable 객체에 대해 착용 메서드 호출
        for (int i = 0; i < a.length; i++) {
            a[i].putOn(); // Wearable 객체 착용
        }

        // 각 Wearable 객체에 대해 벗는 메서드 호출
        for (int i = 0; i < a.length; i++) {
            a[i].putOff(); // Wearable 객체 벗기
        }
    }
}

