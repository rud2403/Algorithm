class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] lc = new int[201];
        boolean check = false;
        
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j < lines[i][1]; j++) {
                lc[j + 100] += 1;
            }
        }
        
        for(int i = 0; i < lc.length; i++) {
            if(lc[i] >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}