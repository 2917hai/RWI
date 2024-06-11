public class Multithreading {

    public static void main(String[] args) {
        Thread dataProcessingThread = new Thread(() -> {
            System.out.println("Starting data processing...");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing chunk " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Data processing complete!");
        });

        Thread loggingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Log: Processed chunk " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        dataProcessingThread.start();
        loggingThread.start();
    }
}
