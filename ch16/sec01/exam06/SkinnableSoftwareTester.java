package ch16.sec01.exam06;

public class SkinnableSoftwareTester {
    public static void main(String[] args) {
        // 기본 생성자로 SkinnableSoftware 객체 x 생성
        SkinnableSoftware x = new SkinnableSoftware();

        // 특정 스킨 색상(GREEN)을 사용하여 SkinnableSoftware 객체 y 생성
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);

        // 객체 x의 스킨을 노랑(YELLOW)으로 변경
        x.changSkin(Skinnable.YELLOW);

        // 객체 x의 현재 스킨을 출력
        System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
        // 객체 y의 현재 스킨을 출력
        System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");
    }
}
