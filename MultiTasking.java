public class MultiTasking {
    public static void main(String[] args) {
        Thread cookingThread = new Thread(() -> {
            System.out.println("Cooking dinner...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Dinner is ready!");
        });

        Thread podcastThread = new Thread(() -> {
            System.out.println("Listening to podcast...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Podcast finished!");
        });

        cookingThread.start();
        podcastThread.start();
    }
}
