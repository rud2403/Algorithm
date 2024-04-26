class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] safeZone = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    safeZone[i][j] = 1; // 중심
                    if(i > 0) { // 위에 공간이 있으면
                        safeZone[i - 1][j] = 1; // 상
                        if(j > 0) { // 좌측에 공간이 있으면
                            safeZone[i - 1][j - 1] = 1; // 좌상
                        }
                        if(j < board[0].length - 1) { // 우측에 공간이 있으면
                            safeZone[i - 1][j + 1] = 1; // 우상
                        }
                    }
                    
                    if(i < board.length - 1) { // 아래 공간이 있으면
                        safeZone[i + 1][j] = 1; // 하
                        if(j > 0) { // 좌측에 공간이 있으면
                            safeZone[i + 1][j - 1] = 1; // 좌하
                        }
                        if(j < board[0].length - 1) { // 우측에 공간이 있으면
                            safeZone[i + 1][j + 1] = 1; // 우하
                        }
                    }
                    
                    if(j > 0) { // 좌측에 공간이 있으면
                        safeZone[i][j - 1] = 1; // 좌    
                    }
                    
                    if(j < board[0].length - 1) { // 우측에 공간이 있으면
                        safeZone[i][j + 1] = 1; // 우    
                    }

                }   
            }
        }
        
        for(int i = 0; i < safeZone.length; i++) {
            for (int j = 0; j < safeZone.length; j++) {
                if(safeZone[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}