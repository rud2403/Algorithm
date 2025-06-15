import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int minDiff = n; // 가장 큰 차이도 n이니 n으로 초기화
        
        // 1. 그래프 만들기
        List<Integer>[] graph = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        // 2. 간선 하나씩 제거
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph[a].remove((Integer) b);
            graph[b].remove((Integer) a);
            
            boolean[] visited = new boolean[n + 1];
            
            // 3. DFS로 노드 수 세기
            int count = dfs(1, visited, graph);
            int diff = Math.abs(count - (n - count));
            
            // 4. 차이 구해서 min 갱신
            minDiff = Math.min(minDiff, diff);
            
            // 5. 간선 복원
            graph[a].add(b);
            graph[b].add(a);
        }
        
        return minDiff;
    }
    
    // dfs 구현
    public int dfs(int node, boolean[] visited, List<Integer>[] graph) {
        visited[node] = true;
        int count = 1;

        for(int next : graph[node]) {
            if(!visited[next]) {
                count += dfs(next, visited, graph);
            }
        }

        return count;
    }
}