package Udemy_Class.Home_Work.ZaurLessons.While_DoWhile_15;

public class Test_do_while {
    public static void main(String[] args) {
        double many = 10;
        double balance = 100.0;

        do{
            System.out.println("your balance is : " + balance);
            System.out.println("Delay stavku");
            System.out.println("Vi proigrali");
            balance -= many;

        }while (balance > 0);
            System.out.println("Dengi ne xvataet");




    }
}
