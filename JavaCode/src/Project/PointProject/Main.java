package Project.PointProject;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();


        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("Black");
        cp.showColorPoint();
    }
}
