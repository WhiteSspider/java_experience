package stack;

public class Stack implements Stack_interface {

    private int set, take;
    private   int q[];
    private int w [];
    //  char v[];
    private int sizemass;

    Stack( int size){
        set = take =0;
        q = new int [size+1];
        sizemass = size+1;
    }


    public void put(int literal) throws Stack_is_full{
        if (set==q.length-1) {
            throw new Stack_is_full();
        }

        q[set]=literal;
        set++;

    }


    public int get() throws StackEmtyStack{
        sizemass--;

        if ((set==q.length-1)&(sizemass==-1)) {
            throw new StackEmtyStack();
        }
        return q[sizemass];

    }


}
