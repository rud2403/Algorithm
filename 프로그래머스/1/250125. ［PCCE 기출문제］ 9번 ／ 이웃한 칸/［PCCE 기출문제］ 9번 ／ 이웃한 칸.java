class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {-1, 1, 0, 0}; // 상하좌우
        int[] dw = {0, 0, -1, 1};
        int answer = 0; 
        String color = board[h][w];
        int mapSize = board.length;
        
        for(int i = 0; i < 4; i++) {
            int nx = h + dh[i];
            int ny = w + dw[i];    
            
            if(nx >= 0 && ny >= 0 && nx < mapSize && ny < mapSize && color.equals(board[nx][ny])) {
                answer++;         
            }
        }  
        
        return answer;
    }
}