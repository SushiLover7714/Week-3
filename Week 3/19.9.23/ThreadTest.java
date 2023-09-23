public class ThreadTest extends Thread {
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.start();
        System.out.println("This is outside of therad");
    }

    public void run() {
        System.out.println("This method is running in a thread");

    }
}
