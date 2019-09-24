package Vihecle;

/**
 * Created by Ustas on 12.05.2019.
 */
public class Vihecle {
    int    passengers;
    int    max_speed;
    double fuelcap;
    int    time_in_road;

    //Конструктор
    Vihecle (int pass, int sp,int fuel,int time ){
        passengers = pass;
        max_speed =sp;
        fuelcap = fuel;
        time_in_road =time;

    }
    /*void Distance(){
        System.out.println("Пройденная дистанция:" +max_speed*time_in_road);
    }
    */
//Метод
    int Distance () {

       int distance = max_speed*time_in_road;
     return  distance;
    }
    //Метод
    double Use_fuel (int use_fuel_in_range, int interval){
        double used_fuel = fuelcap * interval/use_fuel_in_range;
        return used_fuel;
//Метод
    }
     void Print_information (){
        System.out.println(" Максимальная скорость:" +max_speed);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
