package Udemy_Class.Home_Work.ZaurLessons.Arrays_19;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        String[] array1;
        array1 =new String[scanner.nextInt()];

        for ( i=0; i< array1.length; i++) {
            array1[i] = scanner.next();

            }
        for (int j = 0; j < i; j++) {
            System.out.println(array1[j]);
        }
    }
}
