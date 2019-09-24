package change_value_if_send_object_to_method;

public class Test {
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    void Change(Test ob){
        ob.a=ob.a+ob.b;
        ob.b=-ob.b;
    }

}
