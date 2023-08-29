public class First {
    public static void main(String[] args) {
        Second s1 = new Third();
        s1.num = 10;
        System.out.println(s1.num);
        // s1.num2 = 3;
        Second s2 = new Third();
        s1.num3 = 1;
        System.out.println(s2.num3);
        s1.num4 = 1;
        System.out.println(s2.num4);
        s1.secondRun();
        Second.run();
        s1.thirdRun();

    }
}
