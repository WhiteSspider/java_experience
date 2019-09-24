import java.io.*;


public class Nwe {
        public static void main(String[] args) {
            int i;
            FileInputStream fin = null;
            String file;
            if (args.length!=1){
                System.out.println("Usage: ShowFile File");
                return;
            }
            try {
                fin = new FileInputStream(args[0]);

                do{
                    i = fin.read();
                    if(i!=-1) System.out.print((char) i);
                } while (i!=-1);
            } catch (IOException exc){
                System.out.println("Error reading file");
            }
            finally {


                try {
                    if (fin!=null)
                        fin.close();
                }
                catch (IOException exc){
                    System.out.println("Error closing file.");
                }}
        }
    }

