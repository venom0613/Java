package Project.DiningPhilosopher;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {

        int id; // 철학자 id
        Semaphore lstick, rstick; // 왼쪽, 오른쪽 젓가락
        Philosopher(int id, Semaphore lstick, Semaphore rstick) {
            this.id = id;
            this.lstick = lstick;
            this.rstick = rstick;
        }
        public void run() {
            try {
                while(true) {
                    if(id % 2 == 0) { /* id가 짝수라면 */
                        lstick.acquire(); // 왼쪽 집어들기
                        rstick.acquire(); // 오른쪽 집어들기
                    }
                    else { /* id가 홀수라면 */
                        rstick.acquire(); // 오른쪽 집어들기
                        lstick.acquire(); // 왼쪽 집어들기
                    }
                    eating(); // 식사
                    rstick.release(); // 오른쪽 내려놓기
                    lstick.release(); // 왼쪽 내려놓기
                    thinking(); // 생각하기
                }
            } catch (InterruptedException e) {}
        }
        void eating() {
            System.out.println("[" + id + "] eating..");
        }
        void thinking() {
            System.out.println("[" + id + "] thinking..");
        }
    }

