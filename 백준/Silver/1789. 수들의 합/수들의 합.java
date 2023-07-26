import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());

        long sum = 0;
        long result = 0;
        long i = 1;


        while(sum <= s) {
            sum += i;
            i++;
            result++;
        }

        if(sum > s) {
            result--;
        }

        System.out.println(result);
    }
}
