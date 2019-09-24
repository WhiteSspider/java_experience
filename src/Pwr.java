/**
 * Created by Ustas on 13.05.2019.
 */
public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp){
        b = base;
        e = exp;
        val = 1;
        if(exp == 0) return;
        for(;exp>0;exp--) val = val*base;

    }
    double get_pwr(){
        return this.val;
    }
}
