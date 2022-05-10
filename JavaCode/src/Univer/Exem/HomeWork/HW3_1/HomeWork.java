package Univer.Exem.HomeWork.HW3_1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("제곱할 숫자 입력해주세요 : ");
        int sum1 = scanner.nextInt();
        System.out.print("제곱을 입력하시오: ");
        int sum2 = scanner.nextInt();
        int sum = fuctorial((sum1));



        System.out.println(sum1+ " 의 " + sum2 + " 제곱은 " + sum);

    }


    public static int fuctorial(int n){
        if (n == 1){
            return 1;
        }
            int sum = n * fuctorial(n - 1);
            return sum;
        }



}


