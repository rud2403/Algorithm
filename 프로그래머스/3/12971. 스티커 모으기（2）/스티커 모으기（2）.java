/*
1 <= N(길이) <= 100,000
1 <= 숫자 <= 100
*/

class Solution {
    public int solution(int sticker[]) {
        return Math.max(selectZeroCase(sticker), doNotSelectZeroCase(sticker));
    }

    public int selectZeroCase(int[] sticker) {
        int[] dp = new int[sticker.length];
        if(sticker.length == 1) return sticker[0];
        if(sticker.length == 2) return Math.max(sticker[0], sticker[1]);
        
        dp[0] = sticker[0];
        dp[1] = sticker[0];
            
        
        for(int i = 2; i < sticker.length - 1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + sticker[i]);
        }
        
        return dp[sticker.length - 2];
    }
    
    public int doNotSelectZeroCase(int[] sticker) {
        int[] dp = new int[sticker.length];
        if(sticker.length == 1) return sticker[0];
        if(sticker.length == 2) return Math.max(sticker[0], sticker[1]);
        dp[0] = 0;
        dp[1] = sticker[1];
        
        for(int i = 2; i < sticker.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + sticker[i]);
        }
        
        return dp[sticker.length - 1];
    }
}