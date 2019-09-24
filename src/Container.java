/**
 * Created by Ustas on 09.06.2019.
 */
public class Container {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJ";
        System.out.println(s);
        check_summ_variable_lenght str = new check_summ_variable_lenght(s);
        str.replace(s.length());
    }

}
