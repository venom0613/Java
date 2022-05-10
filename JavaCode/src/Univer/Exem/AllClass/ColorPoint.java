package Univer.Exem.AllClass;

public class ColorPoint extends Point {
    String color;
    public ColorPoint() {
        super();
        color = "W";


    }
    public  ColorPoint(int x, int y, String color){
        super(x,y);
        this.color=color;

    }
    public void showColor(){
        super.show();
        System.out.println(color);

    }

}
