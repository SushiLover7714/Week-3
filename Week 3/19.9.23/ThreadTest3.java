public class ThreadTest3 extends Thread {
    public static void main(String[] args) {
        ThreadTest3 thread = new ThreadTest3();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Outside a thread");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " In a thread");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }
}
