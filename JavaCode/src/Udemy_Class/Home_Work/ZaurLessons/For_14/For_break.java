package Udemy_Class.Home_Work.ZaurLessons.For_14;

public class For_break {

    public void time() {
        OUTER:for (int h = 0; h <= 23; h++) {

           INNER: for (int m = 0; m <= 59; m++) {
                System.out.println(h + ":" + m);

                }

            }
        }


    public static void main(String[] args) {

        For_break f = new For_break();
        f.time();



    }


}
