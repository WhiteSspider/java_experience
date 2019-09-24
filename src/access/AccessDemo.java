package access;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass obb = new MyClass();
        obb.setAlpha(-90);
        System.out.println("Alpha "+obb.getAlpha());
        obb.beta=45;
        obb.gamma=54;
        //obb.alpha = 90;
    }
}
