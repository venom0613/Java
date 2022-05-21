package Udemy_homeWork.HomeWork.Other;

public class MethodOverLoading {
    int sum (int i1, int i2 ){
        return i1 + i2;
    }


    String sum (String s1, String s2){
        return s1+s2;
    }
}

class Methodtest{
    public static void main(String[] args) {
        MethodOverLoading m1 = new MethodOverLoading();

        int a = m1.sum(3,4);
        System.out.println(a);

        String s = m1.sum("hi","hi");
        System.out.println(s);

    }
}
