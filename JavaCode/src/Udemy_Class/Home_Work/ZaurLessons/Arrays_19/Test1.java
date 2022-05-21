package Udemy_Class.Home_Work.ZaurLessons.Arrays_19;

public class Test1 {
    public static void main(String[] args) {

        int [][] array1;
        array1 = new int[3][];


        array1[0] = new int[5];
        array1[1] = new int[2];
        array1[2] = new int[7];
        for(int i=0; i< array1.length; i++){
        for (int j=0; j<array1[i].length; j++){
            array1 [i] [j] = i+j;
            System.out.println(array1[i][j]);

        }
            System.out.println();
        }

        int [][] a = new int[4][2];
        System.out.println(a[0][1]);

        }

    }
