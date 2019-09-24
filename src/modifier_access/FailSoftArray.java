package modifier_access;

public class FailSoftArray {
    private int a[];
    private int errval;
    public int lenght;
    public FailSoftArray( int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;

    }
    public int get (int index){
        if(ok(index)) return a[index];
        return errval;
    }

    public boolean put (int index,int val){
        if(ok(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean ok(int index){
        if(index>=0&index<lenght) return true;
        return false;
    }
}
