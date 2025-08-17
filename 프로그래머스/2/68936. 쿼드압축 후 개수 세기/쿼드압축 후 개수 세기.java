class Solution {
    int[] dx = {0, 0, 1, 1};
    int[] dy = {0, 1, 0, 1};
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        
        int length = arr.length;
       
        zip(arr, length, 0, 0);
        
        return answer;
    }
    
    public void zip(int[][] arr, int length, int x, int y) {
        int first = arr[x][y];
        boolean same = true;
        
        for(int i = x; i < x + length; i++) {
            for(int j = y; j < y + length; j++) {
                if(arr[i][j] != first) {
                    same = false;
                    break;
                }
            }
            if(!same) break;
        }
        
        if(same) {
            answer[first]++;
            return;
        }
        
        int half = length / 2;
        for(int k = 0; k < 4; k++) {
            int nx = x + dx[k] * half;
            int ny = y + dy[k] * half;
            zip(arr, half, nx, ny);
        }
        
        
    }
}