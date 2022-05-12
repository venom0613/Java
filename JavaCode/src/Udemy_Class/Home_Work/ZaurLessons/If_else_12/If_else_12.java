package Udemy_Class.Home_Work.ZaurLessons.If_else_12;

import java.util.Scanner;

public class If_else_12 {
    public static void main(String[] args) {
        int a = 10;


        if (a < 20) {
            System.out.println("a menshe 20");
        }
        else
            System.out.println("a ne menshe 20");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What salary do you won't to get?");
        int salary = scanner.nextInt();

        if (salary < 200){
            System.out.println("\nSalary is small");
        } else if (salary < 400 && a < salary || true ){
            System.out.println("\nSalary is normal");
        }else if (salary < 600){
            System.out.println("\nSalary is Low");
        }



    }
}
