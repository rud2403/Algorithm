class Solution {
    public int[] solution(int n) {
        int[] dp = new int[1001];
        int dir = 0; // 0 = 아래, 1 = 위, 2 = 대각선
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        
        for(int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + i;
        }
        
        int[] answer = new int[dp[n]];

        int[][] ta = new int[n][n];
        
        // 이중배열에 [0.0]부터아래, 오른쪽, 대각선 순서로 데이터 넣기
        // n = 4인 경우
        int num = 0;
        int x = -1;
        int y = 0;
        for(int i = n; i > 0; i--) { // 4 ~ 1까지 4(= n)번
            for(int j = 0; j < i; j++) {
                num++;
                if(dir % 3 == 0) {
                    x += 1;
                    ta[x][y] = num;
                } else if(dir % 3 == 1) {
                    y += 1;
                    ta[x][y] = num;
                } else {   
                    x -= 1;
                    y -= 1;
                    ta[x][y] = num;
                }
            }
            dir++;
        }
        
        int idx = 0;
        for(int i = 0; i < ta.length; i++) {
            for(int j = 0; j <= i; j++) {
                answer[idx] = ta[i][j];
                idx++;
            }
        }
            
        return answer;
    }
}