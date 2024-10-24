package ch16.sec01.exam06;

public class SkinnableSoftware implements Skinnable {
    int skin;


    //생성자
    public SkinnableSoftware(){ this.skin = BLACK;}
    public SkinnableSoftware(int skin) {this.skin = skin;}

    @Override
    public void changSkin(int skin) { this.skin = skin;} //스킨변경
    public int getSkin() {return skin;}                   //가져오기
    public String getSkinString(){
        switch (skin){
            case BLACK: return "BLACK";
            case RED: return "RED";
            case GREEN: return "GREEN";
            case BLUE: return "BLUE";
            case YELLOW: return "YELLOW";

        }
        return "";
    }
}
