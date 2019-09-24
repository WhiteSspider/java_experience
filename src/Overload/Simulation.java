package Overload;

public class Simulation {
    int sum;
    Simulation (int num){
        sum = 0;
        for(int i = 1; i<=num;i++)
            sum+=i;
    }
    Simulation(Simulation ob){
        sum = ob.sum;
    }

}
