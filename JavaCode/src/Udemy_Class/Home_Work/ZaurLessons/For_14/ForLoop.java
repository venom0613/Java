package Udemy_Class.Home_Work.ZaurLessons.For_14;

public class ForLoop {

        public void time(){
            OUTER:
            for(int chas=0; chas<=23; chas ++){
                System.out.println("nachala outer Loop");

                INNER:
                for (int minuta=0; minuta<= 59; minuta++){
                    System.out.println(chas + ":" + minuta);
                    if(minuta == 30){break OUTER;}

                }
                System.out.println("end outer loop");

            }

        }

        public static void main(String[] args) {
             ForLoop t = new ForLoop();
            t.time();
        }


    }




