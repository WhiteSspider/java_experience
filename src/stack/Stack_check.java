package stack;

public class Stack_check {
    public static void main(String[] args) {
        Stack ob = new Stack(6);
        try{
        for(int i=0; i < 7; i++){


        ob.put(4+i);
        System.out.println("Loaded");
        }}
        catch (Stack_is_full exc1){
            System.out.println(exc1);
        }
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println(ob.get());
            }
        }
        catch (StackEmtyStack exc2){
            System.out.println(exc2);
        }

}}
