package Queue;

public class Queue_2 {

    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        char name[] = {'t', 'o', 'm'};
        Queue q2 = new Queue(name);
        char ch;
        int i;
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        Queue q3 = new Queue(q1);
        System.out.print("Contents of q1:");

        for (i = 0; i < 9; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.print("\n");

        System.out.print("Contents of q2:");
        for(i=0;i<name.length-1;i++){
            ch = q2.get();
            System.out.print(ch);

        }
        System.out.print("\n");
        System.out.print("Contents of q3:");

        for (i = 0; i < 9; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

    }
}

