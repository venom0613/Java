package Udemy_Class.Home_Work.ZaurLessons.ConstructorAndMethod_5;

public class Human1 {
    String name;
    Car10 car ;
    BankAccaount4 ba ;


    Human1(int a , String b){


    }

    public Human1(){};

    void info (){
        System.out.println("Name:" + name + "Color car:" + car.color + "Balance of Bank: " + ba.balance);
    }

    class HumanTest{

        public static void main(String[] args) {
            Human1 h = new Human1();
            h.name = "Azim";
            h.car = new Car10("red", "V8");
            h.ba = new BankAccaount4(1,180.00);
            h.info();

        }
    }
}

class Car10{
    String color;
    String engine;

    Car10(String c ,String e) {// constructor
        color = c;
        engine = e;
    }

    }

class BankAccaount4{
    int id;
    double balance;

    BankAccaount4(int id1, double balance1){ // constructor
        id = id1 ;
        balance= balance1;
    }

}
