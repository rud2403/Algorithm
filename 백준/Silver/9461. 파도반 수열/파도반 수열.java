import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for(int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2];
            }
//            System.out.println(dp[n]);
            sb.append(dp[n] + "\n");
        }

        System.out.println(sb);
    }
}