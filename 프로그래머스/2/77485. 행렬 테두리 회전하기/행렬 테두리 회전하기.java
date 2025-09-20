class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] table = new int[rows][columns];
        int count = 1;
        
        // 테이블 세팅
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                table[i][j] = count;
                count++;
            }
        }
        
        // 테이블 숫자 회전 시키기
        for(int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;

            int prev = table[x1][y1];
            int min = prev;
            
            // 오른쪽
            for(int y = y1 + 1; y <= y2; y++) {
                // System.out.println(table[x1][j]);
                int cur = table[x1][y];
                table[x1][y] = prev;
                prev = cur;
                min = Math.min(min, prev);
            }
            
            // 아래
            for(int x = x1 + 1; x <= x2; x++) {
                int cur = table[x][y2];
                table[x][y2] = prev;
                prev = cur;
                min = Math.min(min, prev);
            }
            
            // 왼쪽
            for(int y = y2 - 1; y >= y1; y--) {
                int cur = table[x2][y];
                table[x2][y] = prev;
                prev = cur;
                min = Math.min(min, prev);
            }
            
            // 위
            for(int x = x2 - 1; x >= x1; x--) {
                int cur = table[x][y1];
                table[x][y1] = prev;
                prev = cur;
                min = Math.min(min, prev);
            }
            
            answer[i] = min;

        }
        
        return answer;
    }
}