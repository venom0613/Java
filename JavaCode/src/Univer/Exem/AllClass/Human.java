package Univer.Exem.AllClass;
import java.util.Scanner;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;

    void info(){
        System.out.println("Name: " + name +
                "\ncolor car is: " + car.color + "\nEngine Car is: " + car.engine + "\nBank id is: " + ba.id +"\nBalance in Bank: " + ba.balance);
    }
}

    class HumanTest{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Human h = new Human();
            System.out.println("Write your name?");
            h.name = scanner.next();

            System.out.println("Please write Color car and Engine: " );
            h.car = new Car3(scanner.next(), scanner.next());

            System.out.println("Please write Bank id and your Bank Account");
            h.ba = new BankAccount(scanner.nextInt(), scanner.nextDouble());
            h.info();
        }
    }

class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}
