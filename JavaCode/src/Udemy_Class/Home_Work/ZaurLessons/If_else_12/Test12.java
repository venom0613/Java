package Udemy_Class.Home_Work.ZaurLessons.If_else_12;

public class Test12 {

    String a;
    String b;

    Test12(String a, String b){
        this.a = a;
        this.b = b;

    }

    public static void main(String[] args) {
        Test12 t1 = new Test12("A","A");
        Test12 t2 = new Test12("A","A");

        if(t1.equals(t2)) System.out.println("It's true");

        int x =10;
        int y =20;

        int max = (x>y)?x:y;
        System.out.println("Max is "+ max);



    }

}
