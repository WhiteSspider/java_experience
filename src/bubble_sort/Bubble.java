package bubble_sort; /**
 * Created by Ustas on 14.05.2019.
 */
import java.io.*;
public class Bubble {
    int k;
    int string[] = new int[10];
    Bubble(int a[]) {
        string = a;
        }


    void sort() {
        for (int p = 0; p < 10; p++) {
            System.out.println("До сортировки:" + string[p]);
        }
        for (int i = 0; i < 9; i++) {
            for(int n = 8; n >= 0; n--)
            {
            if (string[i] > string[i + 1]) {
                k = string[i];
                string[i] = string[i + 1];
                string[i + 1] =k;
            //    System.out.println(string[i]);
            }
            if (string[n + 1] < string[n]){
                int m = string[n + 1];
                string[n + 1] = string[n];
                string[n] = m;
            }
        }
    }
        for (int l = 0; l < 10; l++) {
            System.out.println("После сортировки:"+string[l]);
        }
}
}
