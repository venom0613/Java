package Udemy_Class.Home_Work.ZaurLessons.ClassAndObject_4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = c1 ;


        c1.color="black";
        c1.engine="V8";

        System.out.println(new Car().color);

    }
}
