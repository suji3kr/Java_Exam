package ch16.sec01.exam06;

//스킨변경 Skinnable 인터페이스
public interface Skinnable {
    int BLACK =0;       //검정
    int RED =1;         //빨강
    int GREEN =2;       //초록
    int BLUE =3;        //파
    int YELLOW =4;      //노
    void changSkin(int skin);  //스킨변경
}
