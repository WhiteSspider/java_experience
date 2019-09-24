package Queue;

/**
 * Created by Ustas on 23.05.2019.
 */
public class Queue {
    private int set, take;
    private   char q[];
  //  char v[];
   // int sizemass;

    Queue( int size){
        set = take =0;
        q = new char [size+1];
        // sizemass = size;
    }

    Queue(Queue ob){
        set = ob.set;
        take = ob.take;
        q = new char[ob.q.length];
        for( int i =take+1;i<=set;i++){
            q[i] = ob.q[i];
        }

    }

    Queue(char a[]){
        set = 0;
        take = 0;
        q = new char[a.length+1];
        for(int i = 0; i<a.length;i++) put(a[i]);
    }


    void put(char literal){
            if (set==q.length-1) {
                System.out.println("Массив заполнен");
                //System.out.println(q);
                return;
            }
        set++;
        q[set]=literal;

        }

        char get(){
        if (set==take) {
            System.out.println("Queue.Queue is empty");
            return (char)0;
        }

        take ++;
            return q[take];

        }


    }

