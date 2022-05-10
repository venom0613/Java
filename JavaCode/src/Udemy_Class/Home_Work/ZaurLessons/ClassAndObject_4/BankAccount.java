package Udemy_Class.Home_Work.ZaurLessons.ClassAndObject_4;

public class BankAccount {

    int id;
    String name;
    double balance;
}


class Test{
    public static void main(String[] args) {

            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();

            MyAccount.id= 1;
            MyAccount.name="Azim";
            MyAccount.balance=35.0;

            YourAccount.id= 2;
            YourAccount.name="Qodir";
            YourAccount.balance=40.5;

            System.out.println("Id:" + MyAccount.id + "\nName: "+ MyAccount.name +"\nBalance:"+ MyAccount.balance);



        }
}