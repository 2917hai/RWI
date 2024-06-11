public class Multicasting1 {

    public static void main(String[] args) {
        Thread exerciseThread = new Thread(() -> {
            System.out.println("Exercising on treadmill...");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Exercise session complete!");
        });

        Thread tvThread = new Thread(() -> {
            System.out.println("Watching TV show...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("TV show episode finished!");
        });

        exerciseThread.start();
        tvThread.start();
    }
}
