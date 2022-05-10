package Udemy_Class.Home_Work.ZaurLessons.ConstructorAndMethod_5;

public class Car2 {
    String color;
    String engine;
    int speed ;

    int gaz(int skorast){
        speed+=skorast;
        return speed;
    }

    int tormaz(int skorast){
        speed-=skorast;
        return skorast;
    }

    void showInfo(){
        System.out.println("\nColor Car:"+ color + "\nEngine car:" + engine + "\nSkorast:" + speed);
    }


}

class Cat2test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();

        c1.color="Black";
        c1.engine="W6";
        c1.speed=60;

        c1.showInfo();
        c1.gaz(50);
        c1.showInfo();
        c1.tormaz(60);
        c1.showInfo();




    }

}