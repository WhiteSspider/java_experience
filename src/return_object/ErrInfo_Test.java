package return_object;

public class ErrInfo_Test {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e= err.getErrorInfo(2);
        System.out.println("Message "+e.msg+" Severity "+e.severity);
        e = err.getErrorInfo(19);
        System.out.println("Message "+e.msg+" Severity "+e.severity);

    }
}
