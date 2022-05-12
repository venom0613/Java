package Udemy_Class.Home_Work.ZaurLessons.If_else_12;

public class Test10 {


    void maximum(int i1, int i2, int i3){
        if(i1>i1 && i1>i3 ){
            System.out.println("Maximum = " + i1);
        }
        else if(i2>i1 && i2>i3){
            System.out.println("Maximum = "+ i2);
        }
        else{
            System.out.println("Maximum = " + i3);
        }

    }

    public static void main(String[] args) {

        Test10 t = new Test10();

        t.maximum(5 , 6, 7);



    }
}
