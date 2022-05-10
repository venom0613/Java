package Univer.Exem.AllClass;
import java.util.Scanner;
public class MonthSchedule {
    int workLine;
    int workLine2;
    String work;
}

    class Day{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonthSchedule day1 = new MonthSchedule();
        MonthSchedule day2 = new MonthSchedule();

        int [] x= new int[5];

        System.out.println("이번 달 스케줄.");
        System.out.print("할일 (입력:1, 보기:2 끝내기:3) ");
        day1.workLine=scanner.nextInt();

        if(day1.workLine == 1 ){
            System.out.print("날짜는(1~30)") ;
            day1.workLine2=scanner.nextInt();

            if (day1.workLine2 ==1){
                System.out.print("할 일 빈칸없이 입력하세요");

                day1.work=scanner.next();
                System.out.println(day1.workLine2+"일의"+" 할 일은"+day1.work );
            }

            System.out.print("할일 (입력:1, 보기:2 끝내기:3) ");
            day1.workLine=scanner.nextInt();
        }




    }
}






