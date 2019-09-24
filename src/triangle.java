import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ustas on 01.06.2019.
 */
public class triangle
    {
        static int theNumber;
        public static void main(String[] args) throws IOException
        {


            try{
                foo();
                System.out.println("A");

            } catch (Exception e){
                System.out.println("B");
            } finally {
                System.out.println("C");
            }


          /*  System.out.print("Enter a number: ");
            theNumber = getInt();
            int theAnswer = triangle(theNumber);
            System.out.println("Triangle="+theAnswer);
            */
        }


        private static void foo() throws Exception{
            try{
                System.out.println("A1");
                throw new Exception();
            } catch (Exception e){
                System.out.println("B1");
                throw new Exception();
            } finally {
                System.out.println("C1");
            }

        }

        public static int triangle(int n)
        {
            if(n==1)
                return 1;
            else
                return( n + triangle(n-1) );
        }

        public static String getString() throws IOException
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
        public static int getInt() throws IOException
        {
            String s = getString();
            return Integer.parseInt(s);
        }
}
