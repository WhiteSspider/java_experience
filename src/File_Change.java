import java.io.*;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Created by Ustas on 26.05.2019.
 */
public class File_Change {
    public static void main(String[] args) throws IOException {


        File data = new File("E:/work2.txt");
        LinkedList<String> str = new LinkedList<>();
        BufferedReader read = new BufferedReader(new FileReader(data));
        String need_string = "mila";
        String replace_string = "krasila";
        int k=0;
        for(;;){
            String line = read.readLine();
            if (line == null) break;
            str.add(line);
        }
        for(int i = 0; i<str.size();i++){
            String temporary_str =  str.get(i);
             int first_index_to_remove = temporary_str.indexOf(need_string);

            if (first_index_to_remove>0) {
                 k=k+1;
                start:
                while (k>1) {
                    int second_index_remove = temporary_str.offsetByCodePoints(first_index_to_remove, need_string.length());
                    System.out.println(second_index_remove);
                    String first_part = temporary_str.substring(0, first_index_to_remove);
                    String second_part = temporary_str.substring(second_index_remove + 1, temporary_str.length());
                    String final_string_to_list = first_part + second_part;
                  //  System.out.println(final_string_to_list);
                    str.remove(i);
                    str.add(i, final_string_to_list);
                    break start;
                }

            }

        }
    }
}