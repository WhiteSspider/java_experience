package static_;

public class SDemo3 {
    public static void main(String[] args) {
        System.out.println("Square root of 2 is" +StaticBlock.rootOf2);
        System.out.println("Square root of 2 is" +StaticBlock.rootOf3);
        StaticBlock ob = new StaticBlock("Inside constructor");
    }
}
