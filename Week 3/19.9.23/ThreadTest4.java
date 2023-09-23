public class ThreadTest4 extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {
        ThreadTest4 thread = new ThreadTest4();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}