package Factorial;

public class Factorial {

        //  Рекурсивный  метод,
        int  factR(int  n)  {
            int  result;
            if(n==1)  return  1;
            //  Рекурсивный  вызов  метода  factRO  .
            result  =  factR(n-1)  *  n;
            return  result;
        }
        //  Вариант  программы,  вычисляющий  факториал  итеративным  способом,
        int  factl(int  n)  {
            int  t,  result;
            result  =  1;
            for(t=1;  t  <=  n;  t++)  result  *=  t;
            return  result;
        }


}
