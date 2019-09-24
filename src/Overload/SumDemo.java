package Overload;

public class SumDemo {
    public static void main(String[] args) {
        Simulation s1 = new Simulation(5);
        Simulation s2 = new Simulation(s1);

        System.out.println("si.sum:  "  +  s1.sum);
        System.out.println("s2.sum:  "  +  s2.sum);

    }
}
