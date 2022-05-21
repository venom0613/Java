package Udemy_homeWork.HomeWork.Other;

public class BankAccaunt {
    int id = 10;
    String name = "Azim";
    double balance = 100;



    void popolnenieScheta (double summaPopolneniya){
        System.out.println("Balans do popolneniya: " + balance);
        System.out.println("Balans popolneniya na: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolneniya: " + balance);
        System.out.println();
    }

    void snyatiyaSoScheta(double summaSnyatiya){
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Blans umenshatiya na : "+ summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya" + balance);
        System.out.println();
    }
}
class BankAccaounTest {
    public static void main(String[] args) {
        BankAccaunt MyAccount = new BankAccaunt();

        MyAccount.popolnenieScheta(30.5);
        MyAccount.snyatiyaSoScheta(20.5);
    }
}
