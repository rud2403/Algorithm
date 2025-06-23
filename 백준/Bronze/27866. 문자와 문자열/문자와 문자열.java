import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] sArray = bf.readLine().split("");
        int n = Integer.parseInt(bf.readLine());

        System.out.println(sArray[n -1]);

    }
}