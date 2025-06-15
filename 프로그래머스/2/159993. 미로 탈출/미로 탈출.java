import java.util.*;

class Solution {
    private static final int START = 0;
    private static final int ROAD = 1;
    private static final int WALL = 2;
    private static final int LEVER = 3;
    private static final int EXIT = 4;
    
    public int solution(String[] maps) {
        int startX = 0, startY = 0;
        
        int[][] map = new int[maps.length][maps[0].length()];
        // 0 시작지점, 1 길, 2 벽, 3 레버, 4 출구, 5 방문
        
        // 1. visited 초기화
        for(int i = 0; i < maps.length; i++) {
            // System.out.println(x);
            char[] row = maps[i].toCharArray();
            for(int j = 0; j < row.length; j++) {
                switch (row[j]) {
                    case 'S':
                        map[i][j] = START;
                        startX = i;
                        startY = j;
                        break;
                    case 'O':
                        map[i][j] = ROAD;
                        break;
                    case 'X':
                        map[i][j] = WALL;
                        break;
                    case 'L':
                        map[i][j] = LEVER;
                        break;
                    case 'E':
                        map[i][j] = EXIT;
                        break;
                }
            }
        }
        
        // 시작 -> 레버 bfs
        int[] leverInfo = bfs(startX, startY, map, LEVER);
        if(leverInfo == null) return -1;

        int leverX = leverInfo[0];
        int leverY = leverInfo[1];
        int toLeverDist = leverInfo[2];
        
        // 레버 -> 출구 bfs
        int[] endInfo = bfs(leverX, leverY, map, EXIT);
        if(endInfo == null) return -1;
        
        int toExitDist = endInfo[2];
        
        return toLeverDist + toExitDist;
    }
    
    public int[] bfs(int x, int y, int[][] map, int target) {
        int rows = map.length;
        int cols = map[0].length;
        
        int[] dx = {1, -1, 0, 0}; // 상하좌우
        int[] dy = {0, 0, -1, 1};
        
        boolean[][] visited = new boolean[map.length][map[0].length];
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{x, y, 0}); // x, y, 거리
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            int dist = cur[2];
            
            if(map[cx][cy] == target) {
                return new int[]{cx, cy, dist};
            } 
            
            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 경계 밖 예외 처리
                if(nx < 0 || ny < 0 || nx >= rows || ny >= cols) continue;
                
                // 벽 또는 이미 방문한 곳 제외
                if(map[nx][ny] == 2 || visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }
        
        return null;
        
    }
}
