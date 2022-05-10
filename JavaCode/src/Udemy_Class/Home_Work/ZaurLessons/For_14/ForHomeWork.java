package Udemy_Class.Home_Work.ZaurLessons.For_14;

public class ForHomeWork {


    public void For1(){
        OUTER:
        for (int chas=0; chas<=23; chas++){

            MIDDLE :for (int minuta=0; minuta<=59; minuta++){

               INNER:
               for (int sec=0; sec<=59; sec++){
                   System.out.println(chas+ ":" + minuta + ":" + sec);
                }
            }

        }
    }

    public static void main(String[] args) {
        ForHomeWork f = new ForHomeWork();
        f.For1();
    }

}

