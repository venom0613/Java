package Udemy_Class.Home_Work.ZaurLessons.Switch_13;

import java.util.Scanner;

public class Switch_13 {


}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write student Grade: ");
        st1.grade = scanner.nextInt();

  //      if (st1.grade == 2) {
  //          System.out.println("realy bad");
  //      }
  //      if (st1.grade == 3) {
  //          System.out.println("bad");
  //      }
  //      if (st1.grade == 4) {
  //          System.out.println("not bad");
  //      }
  //      if (st1.grade == 5) {
  //          System.out.println("good");
  //      }
  //      else {
  //          System.out.println("change your number!");
  //      }


        switch (st1.grade){
            case 2:
                System.out.println("realy bad");
                break;
            case 3:
                System.out.println("bad");
                break;
            case 4:
                System.out.println("not bad");
                break;
            case 5:
                System.out.println("good");
                break;
            default:
                System.out.println("change your number!");

        }
    }

}