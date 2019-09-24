/**
 * Created by Ustas on 13.10.2018.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.*;
public class DoubLylinkQueue {

    public static int triangle(int n)
    {
        System.out.println("Entering: n=" + n);
        if(n==1){
            System.out.println("Returning st 1");
        return 1;}
        else{

            int temo =  n + triangle(n-1);
            System.out.println("n " + n);
            System.out.println("Returning " + temo);
            return( temo );
        }
    }


        // Scanner in = new Scanner(System.in);
       // System.out.println("Введите второе слогаемое:");
        //String next1 = word_in.nextLine();
       // int num2 = in.nextInt();
       // System.out.println(next1);
//
//
//            if ( next.equals("yes")) {
//
//            Scanner word_in2 = new Scanner(System.in);
//            System.out.println("Введите тип файла:");
//            String type = word_in2.nextLine();

//            Scanner word_in3 = new Scanner(System.in);
//            System.out.println("Введите формат файла:");
//            String format = word_in3.nextLine();


//
//
//                LinkedList<String> docs = new LinkedList();
//                FileRead forrmat = new FileRead();
//
//             while (forrmat.DataIn().equals("doc")) {
//                 for ()
//                 docs.add(i=i+1,forrmat.DataIn());
//             }
//                Iterator<String> itr = docs.iterator();
//                while (itr.hasNext()) {
//                    System.out.println(itr.next());
//                }
//
//
//
//        }
//        else {
//
//        }

}

//        docs.add(type);
//        docs.add("position2");
//        docs.add("position3");
//        docs.add("position4");
//        docs.add("position5");
//        docs.add("Grape");
//        docs.add("position7");
//        docs.add("position8");
//        docs.add("position9");
//        docs.add("position10");
//        System.out.println("Actual LinkedList:"+docs);
//        LinkedList <String> list = new LinkedList<String>();
//        list.add("one");
//        list.add("two");
//        docs.addAll(list);
//        System.out.println("After Copy: "+docs);


//        System.out.println(docs);
//        System.out.println("Size of the linked list: "+docs.size());
//        System.out.println("Is LinkedList empty? "+docs.isEmpty());
//        System.out.println("Does LinkedList contains 'Grape'? "+docs.contains("Grape"));


//        DocIn.add(4);
//        DocIn file1 = new DocIn ("12");
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(4);
