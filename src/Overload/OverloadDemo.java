package Overload;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ov = new Overload();
        int resI;
        double resD;
        ov.ovlDemo();
        System.out.println();

        ov.ovlDemo(2);
        System.out.println();

        resI = ov.ovlDemo(4,20);
        System.out.println("Result ov.ovlDemo(4,20); " +resI);
        System.out.println();

        resD = ov.ovlDemo(3.14,5.564);
        System.out.println("Result ov.ovlDemo(3.14,5.564); " +resD);
    }
}
