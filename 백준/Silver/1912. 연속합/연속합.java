import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];
        int[] arr = new int[n + 1];


        String[] strArr = br.readLine().split(" ");

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(strArr[i - 1]);
        }

        dp[1] = arr[1];
        int result = dp[1];

        for(int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);

    }
}