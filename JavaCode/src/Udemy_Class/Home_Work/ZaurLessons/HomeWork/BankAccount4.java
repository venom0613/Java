package Udemy_Class.Home_Work.ZaurLessons.HomeWork;

public class BankAccount4 {
        double balance = 125;


    void popolmemieScheta(double a){
        balance += a;
        System.out.println("Balance posle popolneniye: " + balance);
    }
    void snyatieScheta(double x){
        balance -= x;
        System.out.println("Balance posle syatiya: " + balance);


    }
    void speak(){
        System.out.println("Balance:"+ balance);
    }
}

class BankTest{
    public static void main(String[] args) {
        BankAccount4 b1 = new BankAccount4();

        b1.speak();
        b1.popolmemieScheta(20);
        b1.snyatieScheta(15);
    }
}
