/**
 * Created by Ustas on 13.05.2019.
 */
//метод Finalize перед сборщиком мусора
public class FinDemo {
    int x;

    FinDemo(int i){
        x=i;
    }

        protected void finalize(){
        System.out.println("Finalizing"+x);
    }

    void generator (int i) {
        FinDemo o = new FinDemo(i);
    }
    }

