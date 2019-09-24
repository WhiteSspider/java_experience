/**
 * Created by Ustas on 26.05.2019.
 */
import java.util.*;
public class Work_Wiith_Console {
    public static void main(String args[]) {
       // Scanner in = new Scanner(System.in);
       // String str[] = {in.next()};
        //args = str;
        double my_mass[] = new double[32];
        double mass[];
        mass = new double[12];
        String numbers [][] = {
                {"Bob","8800-3333"},
                {"Bill","8800-9999"},
                {"July","8800-9888"}
        };
        int i;
        if(args.length==0) System.out.println("Usage: java Phone <name>");
        else {
            for( i = 0;i<numbers.length;i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] +":"+ numbers[i][1]);
                    break;
                }
            }
            if(i==numbers.length) System.out.println("Name not found");
        }
           }
}
