package Udemy_homeWork.HomeWork.Other;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department=department2;
    }

    double uvelecheniyaZarplati(){
        salary *= 2;
        return salary;
    }

    void method(int a, int b){
    }

}

 class EpoloyeeTest {
     public static void main(String[] args) {
         Employee emp1 = new Employee(1, "Azim", 24, 30.000,"IT");

         emp1.uvelecheniyaZarplati();
         System.out.println("Novaya zarplata rapotnika " + emp1.surname + ": " + emp1.salary);
     }



 }