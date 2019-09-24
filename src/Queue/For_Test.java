package Queue;

import Queue.Queue;

public class For_Test {
    public static void main(String[] args) {
Queue qe = new Queue(20);
for(int i=70;i<95;i++){
qe.put((char)i);
}
for(int i=70;i<96;i++){

    System.out.println(qe.get());
}
        }
    }