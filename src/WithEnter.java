import forEnum.ForEnum;

import java.util.Scanner;
import java.util.TimerTask;

public class WithEnter extends TimerTask {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("To change the color press ENTER");
        str = scanner.nextLine();
        Thread t1 = new Thread(new TrafficLight(), "t1");
        t1.start();
    }

    @Override
    public void run() {

    }


    static class TrafficLight implements Runnable {
        public void run() {
            while (true) {
                System.out.println(ForEnum.RED);
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                System.out.println(ForEnum.YELLOW);
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                System.out.println(ForEnum.GREEN);
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                System.out.println(ForEnum.YELLOW);
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                System.out.println(ForEnum.RED);
                try {
                    System.in.read();
                } catch (Exception e) {
                }
                break;
            }
        }
    }


}


