package Univer.Exem.Homework_4.Hw4_1;


import java.util.Scanner;
import java.util.Calendar;

class Test1 {
    Calendar now = Calendar.getInstance();
    Scanner scanner = new Scanner(System.in);
    private String name, plName;
    private int get1, get2;

    public Test1(String name) {
        this.name = name;
    }

    public int game() {
        System.out.println(name + "시작 <Enter>키 >>");
      get1 = enter();
      System.out.println("10초 예상 후 <Enter>키 >>");
      get2 = enter();
      if (get1<get2)
        return  get2 - get1;
      else
          return (60-get1)+get2;
    }

    public int enter(){
        plName = scanner.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t현재 초 시간 ="+ now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }
}

 public class Test10{
     public static void main(String[] args) {
         Test1 t1 =new Test1("황기태");
         Test1 t2 =new Test1("이재문");

         System.out.println("10초에 가까운 사람이 이기는 게임입니다");
         int result = t1.game();
         int result2 = t2.game();

         if(Math.abs(result - 10) < Math.abs(result2 -10))
             System.out.println("황기태의 결과 "+result+", 이재문의 결과 "+result2+", 승자는 황기태");
         else
             System.out.println("황기태의 결과 "+result+", 이재문의 결과 "+result2+", 승자는 이재문");
     }

 }
