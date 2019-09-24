/**
 * Created by Ustas on 26.05.2019.
 */
public class StringArrays {
    int a;
    StringArrays(int i){a=i;}

    void swap(StringArrays ob){
        int variable =0;
        System.out.println("До замены: a " +a);
        System.out.println("До замены: ob.a " +ob.a);
        System.out.println("До замены: variable " +variable);
        variable =a;
        a=ob.a;
        ob.a = variable;
        System.out.println("После замены: a " +a);
        System.out.println("После замены: ob.a " +ob.a);
        System.out.println("После замены: variable " +variable);
    }
    }

