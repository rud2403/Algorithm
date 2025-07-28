import java.util.*;

class Solution {
    boolean[] visited; 
    Set<Integer> set = new HashSet<>();
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        
        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {
                dfs(i, i, j, computers);
            }
        }
        
        return set.size();
    }
    
    public void dfs(int startNum, int i, int j, int[][] computers) {
        if(computers[i][j]==1 && !visited[j]) {
            visited[j] = true;
            set.add(startNum);            
            for(int k=0; k < computers.length; k++) {
                dfs(startNum, j, k, computers);
            }
        }
    }
}
