package Udemy_homeWork.HomeWork;

public class Employee {
    int id ;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname =surname1;
        age = age1;
        salary = salary1;
        department =department1;
    }

    double UvelichevaemZarplatu(double salary){
        double sum = salary * 2;
        return sum;
        //salary *= 2;
        //return salary;
        // i na paremetrax ne dovat nechego
    }

     void speak(){
         System.out.println("Id:" + id + " \nSurname:" + surname + "\nage:"+ age + "\nSalary:"+ salary + "\ndepartment:" + department);
     }


}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1 ,"Azim",23,4000,"It");

        emp1.speak();
        System.out.println("Posle Uvelecheniya Zarplati: "+emp1.UvelichevaemZarplatu(455));
    }

}
