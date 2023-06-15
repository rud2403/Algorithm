import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static int red = 0;
    final static int green = 1;
    final static int blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 집의 수

        cost = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) { // 집마다 비용 세팅
            String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(strArr[2]);

            cost[i][red] = a;
            cost[i][green] = b;
            cost[i][blue] = c;
        }

        // 0번째 순서인 경우 비용과 dp의 값이 일치
        dp[0][red] = cost[0][red];
        dp[0][green] = cost[0][green];
        dp[0][blue] = cost[0][blue];

        System.out.println(Math.min(paintCost(n - 1, red), Math.min(paintCost(n - 1, green), paintCost(n - 1, blue))));
    }

    public static int paintCost(int n, int color) {
        if(dp[n][color] == 0) {
            if(color == red) {
                dp[n][red] = Math.min(paintCost(n-1, green), paintCost(n-1, blue)) + cost[n][red];
            } else if(color == green) {
                dp[n][green] = Math.min(paintCost(n - 1, red), paintCost(n - 1, blue)) + cost[n][green];
            } else {
                dp[n][blue] = Math.min(paintCost(n - 1, red), paintCost(n - 1, green)) + cost[n][blue];
            }
        }
        return dp[n][color];
    }
}