class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;

        boolean[][] dp = new boolean[n][n];

        int maxLen = 1;
        int start = 0;

        // 길이 1은 모두 팰린드롬
        for(int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // i를 뒤에서 앞으로, j를 i에서 앞으로
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                // 양 끝 문자가 같아야 팰린드롬 후보가 됨
                if (s.charAt(i) == s.charAt(j)) {
                    // 길이가 2 또는 3이면 안쪽은 자동으로 팰린드롬
                    if (j - i <= 2) {
                        dp[i][j] = true;
                    } else {
                        // 그 외에는 안쪽이 팰린드롬이어야 함
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                    // 새로 찾은 팰린드롬이 더 길면 정답 갱신
                    if(dp[i][j]) {
                        int len = j - i + 1;
                        if (len > maxLen) {
                            maxLen = len;
                            start = i;
                        }
                    }

                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}