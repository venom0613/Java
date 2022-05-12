package Udemy_Class.Home_Work.ZaurLessons.TypeVariables_9;

public class TypeVariables {

    public  String color;
    String engine;
    static int count;

    TypeVariables(){}

    public TypeVariables(String color, String engine){

        int cost = 5000;
        this.color = color;
        this.engine=engine;
        System.out.println(" Color:" + color + " Engine: " + "Cost Car " + cost);
    }

    public void A(String color){}
}
 class MainT{
     public static void main(String[] args) {
         TypeVariables tp = new TypeVariables();
         TypeVariables tp1 = new TypeVariables();
         TypeVariables tp2;
         tp1 = null; // here is died
     }
 }
