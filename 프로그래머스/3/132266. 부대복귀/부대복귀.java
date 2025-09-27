import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        
        // 인접 리스트 구성
        List<Integer>[] g = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        for(int[] e : roads) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        
        // 목적지에서 BFS로 최단거리 테이블 계산
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        Deque<Integer> q = new ArrayDeque<>();
        dist[destination] = 0;
        q.offer(destination);
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int nxt : g[cur]) {
                if(dist[nxt] != -1) continue; // 이미 방문
                dist[nxt] = dist[cur] + 1;
                q.offer(nxt);
            }
        }
        
        // 각 source의 답 구성
        for(int i = 0; i < sources.length; i++) {
            answer[i] = dist[sources[i]];
        }
        
        return answer;
    }
}