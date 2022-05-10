package Udemy_Class.Home_Work.ZaurLessons.ConstructorAndMethod_5;

public class Test1 {

    int summa(int a, int b, int c){
        int result= a+b+c;
        return result;
    }

    int sredneaArif(int a, int b, int c){
       int result2 = summa(a,b,c)/3;
       return result2;

    }

}

class Test2 {
    public static void main(String[] args) {
        Test1 a = new Test1();

        System.out.println(a.summa(13,13,13));

        System.out.println(a.sredneaArif(20,40,60));
    }
}
