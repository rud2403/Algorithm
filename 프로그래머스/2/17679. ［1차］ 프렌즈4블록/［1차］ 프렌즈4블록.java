import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean roof = true;
        String[][] strBoard = new String[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                String str = board[i];
                
                strBoard[i][j] = str.charAt(j) + "";
            }
        }
        
        while(true) {
            List<int[]> list = new ArrayList<>();
            // 네개 제거
            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    if(strBoard[i][j] != null &&
                       strBoard[i][j].equals(strBoard[i][j + 1]) &&
                       strBoard[i][j].equals(strBoard[i + 1][j]) &&
                       strBoard[i][j].equals(strBoard[i + 1][j + 1])
                      ) {
                        list.add(new int[]{i, j});
                    }
                    
                }
            }
            
            if(list.isEmpty()) {
                break;
            }
            
            
            for(int[] i : list) {
                strBoard[i[0]][i[1]] = null;
                strBoard[i[0] + 1][i[1]] = null;
                strBoard[i[0]][i[1] + 1] = null;
                strBoard[i[0] + 1][i[1] + 1] = null;
            }
            
            // 제거된 공백만큼 재정렬
            
            for (int j = 0; j < n; j++) {
                int empty = m - 1;
                for (int i = m - 1; i >= 0; i--) {
                    if (strBoard[i][j] != null) {
                        strBoard[empty][j] = strBoard[i][j];
                        if (empty != i) strBoard[i][j] = null;
                        empty--;
                    }
                }
            }
            
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(strBoard[i][j] == null) answer++;
            }
        }
        
        return answer;
    }
}