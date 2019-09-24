package change_value_if_send_object_to_method;

public class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("Before call"+" a " +ob.a+" b "+ob.b);
        ob.Change(ob);
        System.out.println("After call"+"a " +ob.a+" b "+ob.b);

    }
}
