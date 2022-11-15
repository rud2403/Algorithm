class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length / n;
        int[][] answer = new int[length][n];
        int index = 0;
        
        for(int i = 0; i < answer.length; i++) {
            for(int j= 0; j < answer[0].length; j++) {
               answer[i][j] = num_list[index];
                index ++;
            }        
        }
        
        return answer;
    }
}