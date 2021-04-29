import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundPrinter {

    public static void main (String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        int poundNumber = Integer.parseInt(bufferedReader.readLine());
        if (poundNumber < 0 || poundNumber > 100){
            System.out.println("ERROR input");
        }

        int space = 2 * poundNumber - 2;
        for(int i = 0; i < poundNumber; i++) {
            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                if (i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print("* ");
                }
            }
            space -=2;
            System.out.println();
        }
    }
}