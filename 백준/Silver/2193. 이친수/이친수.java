import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] dp = new long[91];

        dp[1] = 1;
        dp[2] = 1;

        int num = Integer.parseInt(br.readLine());

        for(int i = 3; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[num]);
    }
}