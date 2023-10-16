import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());

        int[] dp1 = new int[k + 2];
        int[] dp2 = new int[k + 2];

        dp1[1] = 0;
        dp2[1] = 1;

        dp1[2] = 1;
        dp2[2] = 1;

        if(k > 2) {
            for(int i = 3; i <= k; i++) {
                dp1[i] = dp1[i - 1] + dp1[i - 2];
                dp2[i] = dp2[i - 1] + dp2[i - 2];
            }
        }

        System.out.println(dp1[k] + " " + dp2[k]);

    }
}