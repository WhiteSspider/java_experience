package object_to_method;

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(12,3,4);
        Block ob2 = new Block(12,3,4);
        Block ob3 = new Block(5,6,9);
        System.out.println("ob1 same demension ob2 "+ob1.sameBlock(ob2));
        System.out.println("ob1 same demension ob3 "+ob1.sameBlock(ob3));
        System.out.println("ob1 same Volume ob2 "+ob2.sameVolume(ob1));
        System.out.println("ob1 same Volume ob3 "+ob3.sameVolume(ob1));
    }
}
