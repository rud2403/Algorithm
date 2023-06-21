import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[1001];

        dp[1] = 1;
        dp[2] = 3;

       int add;

        if(n >= 3) {
            for(int i = 3; i <= n; i++) {

                if(i % 2 == 0) {
                    add = 2;
                } else {
                    add = 1;
                }


                for(int j = 1; j < i; j++) {
                    dp[i] += dp[j];
                }

                dp[i] = (dp[i] + add) % 10007;
            }
        }

        System.out.println(dp[n]);
    }
}