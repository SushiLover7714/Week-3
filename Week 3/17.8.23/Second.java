public abstract class Second {
    protected int num = 7;
    final int num2 = 1;
    int num3 = 0;
    static int num4 = 0;

    public static void run() {
        System.out.println("run");
    }

    public void secondRun() {
        System.out.println("Second run");
    }

    public abstract void thirdRun();

}
