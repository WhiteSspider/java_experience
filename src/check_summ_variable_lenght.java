public class check_summ_variable_lenght {
 private String inside_str;
    check_summ_variable_lenght(String str){
        inside_str = str;
    }
    char replace(int n){
        if(n==0) return inside_str.charAt(0);
        n--;
        System.out.print(inside_str.charAt(n));
        return replace(n);
    }
}