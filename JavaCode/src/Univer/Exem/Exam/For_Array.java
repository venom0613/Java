package Univer.Exem.Exam;
import java.util.Scanner;


public class For_Array {

    public static void main(String[] args) {
       int [] a ;
       int n ;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ender how many index you wont to make: ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter parameter[" + i + "] =");
            a[i] = scanner.nextInt();
        }
    }
}
