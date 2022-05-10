package Udemy_Class.Home_Work.ZaurLessons.OverloadingAndThis_6;

public class MethodOverLoading {
    void show(int i1){
        System.out.println(i1);
    }
    void  show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("String: " +  s + " int: " + a );
    }
    void show(int a , String s){
        System.out.println("Kakoy xoroshi den" );
    }

}

class MethodOverLoadingTest{
    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        int a=500;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Hello";
        mo.show(s);
        mo.show("privet", 10 );



    }


}