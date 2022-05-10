package Univer.Exem.AllClass;

public class Point {
    protected int x;
    int y;
    public Point() {
        x=0;
        y=0;
        System.out.println("color 객제 생성");

    }
    public  Point(int x , int y){
        this.x=x;
        this.y=y;
        System.out.println("color point 객제 생성");

    }
    public void show(){
        System.out.println("("+x+","+y+")");
    }

}
