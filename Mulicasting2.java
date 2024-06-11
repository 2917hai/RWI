public class Mulicasting2 {

    public static void main(String[] args) {
        Thread emailThread = new Thread(() -> {
            System.out.println("Answering emails...");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished answering emails!");
        });

        Thread coffeeThread = new Thread(() -> {
            System.out.println("Drinking coffee...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished coffee!");
        });

        emailThread.start();
        coffeeThread.start();
    }
}
