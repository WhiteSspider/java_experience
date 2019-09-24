package src_editor;

import src_editor.File_Work;

import java.io.*;
import java.util.*;


/**
 * @author Ustas
 * @version 1.1
 */
public class emulation {
    public static void main(String[] args) throws IOException {
        String desired_condition = "if";
        String file_way ="/media/vasilev/FFCCEDA27B15A75C/Е/work2.txt";
        String desired_string;
        File_Work tst = new File_Work(file_way);
        LinkedList<String> str = new LinkedList<>();
        //LinkedList<String> internal_code_block = new LinkedList<>();
        str = tst.create_list();
        start_cycle:
        for (int v = 0; v < str.size(); v++) {
            desired_string = tst.read_desired_condition(str, v);//find desire string
            if (desired_string.contains(desired_condition)) {          //if desire string found, start code block detection all list
                int start_block = tst.start_code_block_in_all_list(str, v, desired_string); //shift from start block from v pos
                int quantity_space = tst.count_space(str, start_block-1);
                int end_block = tst.find_end_code_block_in_all_list(quantity_space, start_block , str);
                int quantity_conditions = tst.count_condition(start_block, end_block+1, desired_string, str);

                if (quantity_conditions > 0) {                  //if found condition in code block, start code block detection local and delete strings
                    start_internal_block_operation:
                    while (quantity_conditions>0){//for (int i = quantity_conditions; i < 0; i--) {
                                                                //code block detection local
                        int internal_start_block = tst.start_code_block_local(str, start_block, end_block+1, desired_string);//shift from start block external
                        int internal_quantity_space = tst.count_space(str, internal_start_block-1);
                                                                //count else to del start
                        int internal_end_start_else_block = tst.find_end_code_block_local(internal_quantity_space, internal_start_block, end_block+1, str);
                                                                //count end str to del for else
                        int else_end_to_del_str = tst.find_end_code_block_in_all_list(internal_quantity_space,internal_end_start_else_block,str);
                        //TODO method find_end_code_block_local shift to 2 pos, not uniq
                        /* if(term)
                             ------
                             ------
                           else
                             ------ (internal_end_block_start_else)
                             ------
                             position_else_end_to_del

                        */
                        str = tst.delet_code_block(internal_end_start_else_block-1,else_end_to_del_str+1,str);
                        str = tst.delet_string(internal_start_block-1,str);
                        end_block = end_block - (((else_end_to_del_str+1)-(internal_end_start_else_block-1))+2);
                        quantity_conditions--;
                        continue start_internal_block_operation;
                    }
                    continue start_cycle;
                }
            }
            else continue start_cycle;


        }
        tst.edited_file_create(str);
    }

    }



 /*//Запись и считывание очереди
    public static void main(String args[]) {
        int sizemass = 50;
        char literal = 'A';
        Queue.Queue setter = new Queue.Queue(sizemass);
        Queue.Queue getter = new Queue.Queue(4);
        for (int i =0;i<sizemass;i++){
            setter.put((char)(literal+i));
        }
        System.out.println("Get char");
        for(int j = 0; j<sizemass;j++){
            char ch = setter.get();
            if (ch!=(char)0);
            System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
// использовать небольшую очередь smallQ для генерации ошибок
        for(char i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            getter.put((char) ('Z' - i));
                    System.out.println();
        }
        System.out.println();

        System.out.print("Contents of smallQ: ");
        for(char i=0; i < 5; i++) {
           char ch = getter.get();
            if(ch != (char) 0) System.out.print(ch);
        }

    }
    */
//**************end**********************
/*
    public static void main(String args[]) {
        Vihecle.Vihecle uaz_patriot = new Vihecle.Vihecle(10,200,60,48);
        Vihecle.Vihecle Jaguar = new Vihecle.Vihecle(2,300,65,43);
       // Vihecle.Vihecle construct = new Vihecle.Vihecle();
        uaz_patriot.fuelcap = 6;// 6 л на 100 километров
        uaz_patriot.max_speed = 50; // 90 км в час
        uaz_patriot.time_in_road = 48;

        //Sport's car
        Jaguar.fuelcap = 9;
        Jaguar.max_speed = 300;
        Jaguar.time_in_road = 48;


        System.out.println("Расстояние пройденное UAZ:" + uaz_patriot.Distance() +" км");
        System.out.println("Использованно топлива UAZ:" + uaz_patriot.Use_fuel(100,uaz_patriot.Distance()) +" л");
        uaz_patriot.Print_information();
        System.out.println("           ");
        System.out.println("Расстояние пройденное Jaguar:" + Jaguar.Distance() +" км");
        System.out.println("Использованно топлива Jaguar:" + Jaguar.Use_fuel(90,Jaguar.Distance()) +" л");
        Jaguar.Print_information();
        System.out.println(uaz_patriot.time_in_road);


    }*/

/*
// Глава 3, Упражнение 11, стр 121
public class src_editor.emulation {
    public static void main(String args[]) {
        int count_big_to_small = 0;
        int count_small_tobig = 0;
        start_program:
        for(;;) {
            Scanner word_in = new Scanner(System.in);
            System.out.println("Введите символы:");
            String next1 = word_in.nextLine();

            begin_cycle:
            for (int i = 0; i < next1.length(); i++) {
                char c = next1.charAt(i);

                //Bib_to_Small:
                if ((c != '.') && (int) c < 96) {
                    char symbol2 = (char) ((int) c ^ 32);
                    count_big_to_small++;
                    System.out.println("Bib_to_Small: " + symbol2);
                    continue begin_cycle;
                    //SmalltoBig:
                } else if ((c != '.') && (int) c > 96) {
                    count_small_tobig++;
                    char out2 = (char) ((int) c & 65503);
                    System.out.println("SmalltoBig: " + out2);
                    continue begin_cycle;
                } else if (c == '.') {
                    System.out.println("Общее количество строчных в прописные "+count_big_to_small);
                    System.out.println("Общее количество прописных в строчные "+count_small_tobig);
                    System.out.println("Find dot");
                    break start_program;
                }
            }
            System.out.println("Общее количество строчных в прописные "+count_big_to_small);
            System.out.println("Общее количество прописных в строчные "+count_small_tobig);
            continue start_program;
        }

*/
             /*
 1101_1111 = 65503
 0110_0001 = 97?
 0100_0001 = 65
 0110_0010 = 98(b)
 1101_1111
 0100_0010 = 66(B)
 0010_0000

 ‭0110_1001
 ‬0100_1001
              */

/*  Страница 120, упражнение №1 к главе 3
public class src_editor.emulation {
            public static void main(String args[]) throws IOException {
                int p = 0;
                start_cycle: for (; ; ){
                step1:{
                    InputStream inputStream = System.in;
                    Reader inputStreamReader = new InputStreamReader (inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    System.out.println("Set string");
                    String num1 = bufferedReader.readLine();
                    p=0;
                      step2:
                      for(int i=0; i < num1.length();i++){

                        if(num1.charAt(i) == '.')
                        {
                            System.out.println("find dot");
                            break start_cycle;
                        }
                        else if (num1.charAt(i) == ' ')
                        {
                            p++;
                            continue step2;

                        }
                        else   {

                            continue step2;

                        }
                      }
                }
                System.out.println("Find probel " +p);
                System.out.println("can't find dot");
            }
                System.out.println("Find probel " +p);
                System.out.println("Good bye bitch");
    }
}
*/
    /*  ****str 113 Glava 3 ****
    int i;
        for(i=1;i<4;i++) {
            one:{
                two:
                {
                    three:
                    {
                        System.out.println("\ni is" + i);
                        //переходы по меткам
                        if (i == 1) break one;
                        ;
                        if (i == 2) break two;
                        ;
                        if (i == 3) break three;
                        System.out.println("won't print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After bloick two");
                }
            System.out.println("After block one");
            }
        System.out.println("After for");

     */

/*public class src_editor.emulation
{
    /** Comment for class
     * Here start poind for a programm
     *  @param args command line values
     * */
/*
    public static void main(String[] args) {

        // DoubLylinkQueue link = new DoubLylinkQueue();
//
//        System.out.println("Введите первое слогаемое:");
//       // String next1 = word_in.nextLine();
          Scanner in = new Scanner(System.in);
//        String num1 = in.nextLine();
//       // int x = link.linkedList(num1);
//        String b = num1;
//        int x = DoubLylinkQueue.linkedList(b);
//        System.out.println(x);
        /**Comment for out object
         *
         */
/*
        int f,g;
        Scanner in2 = new Scanner(System.in);
        int num1 = in2.nextInt();

        for ( int i = 2;i<200 ;i++) {
            f = num1%i;
         if (f==)
        }

        }
  */

//        System.out.println("Введите число:");
//        int num2 = in2.nextInt();
//        int c = num2 >> 1;
//        if (c==0)
//        {
//            System.out.println(+c +"  является степенью двойки");
//        }
//        else
//        {
//            System.out.println(+c +" не является степенью двойки");
//        }
      /*  Scanner in = new Scanner(System.in);
        System.out.println("Введите выслугу лет:");
        int num1 = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите зарплату:");
        int num2 = in2.nextInt();

        if (num1 < 5)
        {
            double a = (num2 * 0.1);
            double b = a + num2;
            System.out.println("Ваша премия:" +a +"Ваша зарплата:" +b);
        }
        else if (num1 >= 5 && num1 <10)
        {
            double a1 = (num2 * 0.15);
            double b1 = a1 + num2;
            System.out.println("Ваша премия:" +a1 +"Ваша зарплата:" +b1);

        }
        else if (num1 >= 10 && num1 <15)
        {
            double a2 = (num2 * 0.25);
            double b2 = a2 + num2;
            System.out.println("Ваша премия:" +a2 +"Ваша зарплата:" +b2);


        }

        else if (num1 >= 15 && num1 <20) {
            double a3 = (num2 * 0.35);
            double b3 = a3 + num2;
            System.out.println("Ваша премия:" + a3 + "Ваша зарплата:" + b3);
        }

        else if (num1 >= 20 && num1 <25) {
            double a4 = (num2 * 0.45);
            double b4 = a4 + num2;
            System.out.println("Ваша премия:" + a4 + "Ваша зарплата:" + b4);
        }
        else if (num1 >= 25) {
            double a5 = (num2 * 0.5);
            double b5 = a5 + num2;
            System.out.println("Ваша премия:" + a5 + "Ваша зарплата:" + b5);
        }*/

//        Scanner in = new Scanner(System.in);
//        StringArray type = in.;
//        String str = "мама";
//        for(int i =0; i<20; i++)
//        boolean result = type[i].equalsIgnoreCase(str);
//        System.out.println(result);
       /* System.out.println("Hello today is:");
        System.out.println(new Date());
      */


       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите аргумент");
        String type = in.nextLine();
        System.out.println("Введите текст для анализа на наличие аргумента");
        String type2 = in.nextLine();
        boolean contain1 = type2.startsWith(type);
        if (contain1)
        {
            System.out.println(type2);
        }
        else
        {
            System.out.println("Соответствия не найдено");
        }
    }*/