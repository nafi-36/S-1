import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OutputVariable {
    public static void main(String[] args) {
        // int nilai = 10;
        // nilai = 45;
        // char x;
        // x = 'A';
        // System.out.println(nilai);
        // System.out.println("The value of x = " + x);

        String data;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader dataIn = new BufferedReader(isr);
            System.out.println("Write something : ");
            data = dataIn.readLine();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}


