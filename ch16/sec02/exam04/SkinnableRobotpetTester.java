package ch16.sec02.exam04;

public class SkinnableRobotpetTester {
    //p가 참조하는 인스턴스에 자기 소개를 시킨다
    static void intro(Pet p){
        p.introduce();
    }

    public static void main(String[] args) {
        Pet[] a={
           new Pet("Kurt", "아이"),
           new RobotPet("R2d2", "루크"),
           new SkinnableRobotPet("OSX5", "APPLE", SkinnableRobotPet.YELLOW),
           new Pet("마이클", "영남"),
        };

        for(Pet p: a){
            intro(p); // p가 참조하는 인스턴스에 자기소개시킴
            //p의 참조대상이 SkinnableRobotPet이면..
            if (p instanceof SkinnableRobotPet) {
                System.out.println("스킨은");
                ((SkinnableRobotPet)p).printSkin();
                System.out.println("입니다.");
            }
            System.out.println();
        }
    }
}
