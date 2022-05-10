package Udemy_Class.Home_Work.ZaurLessons.ConstructorAndMethod_5;

public class Car3 {
    Car3(String svet, String mator){
        color = svet;
        engine = mator;

        System.out.println(color +"\n"+ engine);

    }
    String color;
    String engine;

}

class Test3{
    public static void main(String[] args) {
        Car3 car =new Car3("Black","BM7");





    }


}
