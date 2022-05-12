package Udemy_Class.Home_Work.ZaurLessons.While_DoWhile_15;

public class While_ {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you have many?");
//        int answer = scanner.nextInt();

//        while (answer > 100){
//            System.out.println(answer);
//            answer++;
//          if(answer > 300){break;}
//
//        }

    boolean b = true;
    int a = 1;

    while (b){
        System.out.println(a);
        if (a % 3 == 0 && a % 7 == 0){
            b = false;
        }
        a++;
    }

    }
}
