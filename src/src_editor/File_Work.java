package src_editor;

import java.io.*;
import java.util.*;

/**
 * Created by Ustas on 29.05.2019.
 */
public class File_Work {

    String file_way;

    File_Work(String way) {
        file_way = way;
    }

    LinkedList create_list() throws IOException {
        File data = new File(file_way);
        LinkedList<String> str = new LinkedList<>();
        BufferedReader read = new BufferedReader(new FileReader(data));
        for (; ; ) {
            String line = read.readLine();
            if (line == null) break;
            str.add(line);
        }

        return str;
    }

    String read_desired_condition (LinkedList<String> list, int start_element){
        String current_string = "zero";
        start_cycle:
        for(int i = start_element; i<list.size();i++){
            String temporary_link = list.get(i);
            if(temporary_link.contains(" if")){
                current_string = temporary_link;//.trim();
                break start_cycle;
            }
            else continue start_cycle;
        }
        return current_string;
    }

    int start_code_block_in_all_list (LinkedList<String> link, int str_position, String desired_string) throws IOException{
        int counter = 0;
        int first_string;
        int lol = link.indexOf(desired_string);
        //start_cycle:
       // for(int i = str_position;i<link.size();i++){
          //  String temporary_link = link.get(i);
            //first_string = temporary_link.indexOf(desired_string);
            //if(first_string<0){
              //  counter++;
                //continue start_cycle;
            //}
            //else if(first_string>0) break start_cycle;
        //}
        return lol+1; //counter+1;
    }

    int start_code_block_local (LinkedList<String> link, int start_code_block, int end_code_block, String desired_string) throws IOException{
        int counter = 0;
        int first_string;
        start_cycle:
        for(int i = start_code_block;i<end_code_block;i++){
            String temporary_link = link.get(i);
            first_string = temporary_link.indexOf(desired_string);
            if(first_string<0){
                counter++;
                continue start_cycle;
            }
            else if(first_string>0) break start_cycle;
        }
        return counter+start_code_block+1; //counter+1;
    }

    int count_space(LinkedList<String> link, int position_str) throws IOException {
        int counter = 0;
        //start_cycle:
        //for (int i = 0; i < link.size(); i++) {
            String temporary_link = link.get(position_str);
            //int first_string = temporary_link.indexOf(need_string);
            //if (first_string > 0) {
                for (int j = 0; j < temporary_link.length(); j++) {
                    if (temporary_link.charAt(j) != ' ') {
                        break;
                    }
                    else if(temporary_link.charAt(j) == ' '){
                        counter++;
                    }
                }
                //break start_cycle;
        return counter;
    }

    int find_end_code_block_in_all_list (int needed_space, int start_code_block, LinkedList<String> for_replace) throws IOException {
        int second_counter = 0;
        int to_first_event = 0;
        int from_first_event = 0;
        int string_position = 0;
        start_cycle:
        for (int j = start_code_block; j < for_replace.size(); j++) {
            String temporary_link_second = for_replace.get(j);
            string_position++;
            start_cycle2:
            for(int k = 0;k<temporary_link_second.length();k++){
                 if(temporary_link_second.charAt(k)!=' '){
                    if(second_counter==needed_space) break start_cycle;
                    else second_counter=0;
                    continue start_cycle;

                }
                else if(temporary_link_second.charAt(k)==' '){
                    second_counter++;
                    continue start_cycle2;
                }
            }
        }
        return string_position +start_code_block-2;
    }

    int find_end_code_block_local (int needed_space, int start_code_block, int end_code_block, LinkedList<String> for_replace) throws IOException {
        int second_counter = 0;
        int word_counter = 0;
        start_cycle:
        for (int j = start_code_block; j < end_code_block; j++) {
            String temporary_link_second = for_replace.get(j);
            word_counter++;
            start_cycle2:
            for(int k = 0;k<temporary_link_second.length();k++){
                if(temporary_link_second.charAt(k)!=' '){
                    if(second_counter==needed_space) break start_cycle;
                    else second_counter=0;
                    continue start_cycle;

                }
                else if(temporary_link_second.charAt(k)==' '){
                    second_counter++;
                    continue start_cycle2;
                }
            }
        }
        return word_counter+start_code_block ;
    }

    int count_condition (int start_code_block, int end_code_block, String desired_string, LinkedList<String> list){
        boolean first_string;
        int counter=0;
        start_cycle:
        for(int i = start_code_block; i < end_code_block;i++){
            String temporary_link = list.get(i);
            if(first_string = temporary_link.contains(desired_string)){
                counter++;
                continue start_cycle;
            }
        }
        return counter;
    }


    LinkedList delet_code_block (int sart_code_block, int end_code_block, LinkedList<String> str) throws IOException{
       int del = end_code_block - sart_code_block +1;
        while(del>0){
            str.remove(sart_code_block);
            del--;
        }
        return  str;
    }

    LinkedList delet_string (int string_position, LinkedList<String> str ){
        str.remove(string_position);
        return str;
    }


    void edited_file_create(LinkedList<String> str) throws IOException{
        File data_wr = new File("Current.txt");
        data_wr.createNewFile();
        FileWriter writer = new FileWriter(data_wr);
        for(int i = 0;i<str.size();i++){
            String temporary_link = str.get(i);
            writer.write(temporary_link);
            writer.write('\n');
        }
        writer.close();
    }
}