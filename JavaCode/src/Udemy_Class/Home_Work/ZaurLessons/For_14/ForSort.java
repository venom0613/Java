package Udemy_Class.Home_Work.ZaurLessons.For_14;
import java.util.Arrays;

public class ForSort {
    public static void main(String[] args) {
        int array[]= {10,3,-4,1,7,9,2};
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i=0;i< array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array, 10 );
        System.out.println(index1);


    }
}
