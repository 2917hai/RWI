public class Multithreading1 {

    public static void main(String[] args) {
        Thread downloadThread = new Thread(() -> {
            System.out.println("Starting file download...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File download complete!");
        });

        Thread progressThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Download progress: " + (i * 20) + "%");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        downloadThread.start();
        progressThread.start();
    }
}
