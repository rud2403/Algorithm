import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1}; // 상 하 좌 우
    static String[][] strMap;
    static boolean[][] checked;
    
    public List solution(String[] maps) {
        strMap = new String[maps.length][maps[0].length()];
        checked = new boolean[maps.length][maps[0].length()];
        List<Integer> answer = new ArrayList<>();
        
        // strMap 세팅
        for(int i = 0; i < maps.length; i++) {
            String[] strArr = maps[i].split("");
            for(int j = 0; j < strArr.length; j++) {
                strMap[i][j] = strArr[j];
            }
        }
        
        for(int i = 0; i < strMap.length; i++) {
            for(int j = 0; j < strMap[i].length; j++){
                int sum = dfs(i, j);
                if(sum != 0) answer.add(sum);
            }
        }
        
        if(answer.isEmpty()) {
            answer.add(-1);
        } else {
            Collections.sort(answer);
        }
        
        for(int i : answer) {
            System.out.print(i + " ");
        }
        
        
        return answer;
    }
    
    public int dfs(int x, int y) {
        if("X".equals(strMap[x][y]) || checked[x][y]) return 0; // 지도가 X거나 이미 방문했다면
        
        checked[x][y] = true;
        int cnt = Integer.parseInt(strMap[x][y]);
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < strMap.length && ny >= 0 && ny < strMap[0].length) {
                cnt += dfs(nx, ny);
            }
        }
        
        return cnt;
        
    }
}