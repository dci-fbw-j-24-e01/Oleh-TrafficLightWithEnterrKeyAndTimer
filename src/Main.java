import forEnum.ForEnum;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyLight(), "t1");
        t1.start();
    }


    static class MyLight implements Runnable {
        public void run() {
            while (true) {
                System.out.println(ForEnum.RED);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(ForEnum.YELLOW);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(ForEnum.GREEN);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(ForEnum.YELLOW);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(ForEnum.RED);
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }


}

