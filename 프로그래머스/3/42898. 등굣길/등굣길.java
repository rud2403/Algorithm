/*
m: 열
n: 행
puddles: 물이 잠긴 좌표를 담은 배열
*/

class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int solution(int m, int n, int[][] puddles) {
        boolean[][] blocked = new boolean[n][m];
        for(int[] p : puddles) {
            int x = p[0] - 1;
            int y = p[1] - 1;
            if(0 <= x && x < m && 0 <= y && y < n) blocked[y][x] = true;
        }
        
        int[][] dp = new int[n][m];
        dp[0][0] = blocked[0][0] ? 0 : 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(blocked[i][j]) { // 물웅덩이 인 경우
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 0 && j == 0) continue;
                
                long fromUp = (i > 0) ? dp[i - 1][j] : 0;
                long fromLeft = (j > 0) ? dp[i][j - 1] : 0;
                dp[i][j] = (int) ((fromUp + fromLeft) % MOD);
            }
        }
        
        return dp[n - 1][m - 1];
    }
}