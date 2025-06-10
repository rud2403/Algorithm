import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine()); // 테스트 케이스 수
        int[][] dp = new int[15][15];

        for(int j = 0; j <= 14 ; j++) { // 0층 주민 수 세팅
            dp[0][j] = j;
        }

        for(int i=0; i < t; i++) {
            // 1 <= k,n <= 14
            int k = Integer.parseInt(bf.readLine()); // k층
            int n = Integer.parseInt(bf.readLine()); // n호

            // 아파트는 0층 부터있음
            // 각층에는 1호부터 잇음
            // 0층의 i호 에는 i명이 산다
            for(int x = 1; x <= k; x++) { // 1층부터 시작
                for(int y = 1; y <= n; y++) { // 1호부터 시작
                    dp[x][y] = dp[x][y - 1] + dp[x-1][y];
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}