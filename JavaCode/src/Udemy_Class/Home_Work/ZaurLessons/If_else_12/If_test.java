package Udemy_Class.Home_Work.ZaurLessons.If_else_12;

public class If_test {
        int engine;
        int doorCount;

        If_test(int engine , int doorCount){
            this.engine = engine;
            this.doorCount = doorCount;
        }


}

class Test{
    public static void main(String[] args) {
        If_test if1 = new If_test(3,4);
        If_test if2 = new If_test(3,5);

        if(if1.equals(if2)) System.out.println("A는 B보다 큼");

        /*if(if1.engine > if2.engine) {
            if (if1.doorCount > if2.doorCount) // double if
                System.out.println("Firs car is strong");
            else
                System.out.println("Engine is strong but doors is not much");
        }else
            System.out.println("First car is not strong ");
*/


    }
}
