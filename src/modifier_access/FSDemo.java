package modifier_access;

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;
        System.out.println("Fail quietly.");
        for(int i=0;i<(fs.lenght*2);i++) {
            fs.put(i, i*10);
        }
        for(int i=0;i<(fs.lenght*2);i++){
            x = fs.get(i);
            if(x!=-1) System.out.println(x +" ");
        }
        System.out.println(" ");
        for(int i=0;i<(fs.lenght*2);i++) {
            if(!fs.put(i, i*10))
                System.out.println("Out of bounds " +i +" element");
        }
        for(int i=0;i<(fs.lenght*2);i++){
            x=fs.get(i);
            if(x!=-1) System.out.println(x+" ");
            else
                System.out.println("Index "+ i + " out of bounds");
        }
    }
}
