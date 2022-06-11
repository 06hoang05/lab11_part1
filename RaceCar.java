package javaprogramming.lab1;

public class RaceCar extends Thread {
    int finnish;
    String name;

    RaceCar(int finnish, String name) {
        this.finnish = finnish;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < finnish; i++) {
            System.out.println(name + ": " + (i + 1) + "running...");
            try {
                Thread.sleep(Math.round(Math.random() * 5000));
            } catch (Exception e) {
            }
        }
        System.out.println(name + " finished ");
    }
}
