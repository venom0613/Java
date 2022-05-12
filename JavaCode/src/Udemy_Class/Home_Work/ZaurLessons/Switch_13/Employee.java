package Udemy_Class.Home_Work.ZaurLessons.Switch_13;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write 7 days of the week: ");
        String week = scanner.next();

        switch(week){
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                System.out.println("work till 5 o'clock");
                break;
            case "Sat":
            case "Sun":
                System.out.println("You don't work");
                break;
            default:
                System.out.println("It was mistake");

        }
    }
}
