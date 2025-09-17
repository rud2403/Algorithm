import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 1) 인접리스트
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        for (int[] e : edge) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        // 2) 거리배열: 미방문은 -1
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        // 3) BFS
        Deque<Integer> q = new ArrayDeque<>();
        dist[1] = 0;
        q.offer(1);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : g[cur]) {
                if (dist[nxt] == -1) {        // 처음 방문일 때만 갱신
                    dist[nxt] = dist[cur] + 1;
                    q.offer(nxt);
                }
            }
        }

        // 4) 최대 거리와 개수
        int max = 0;
        for (int i = 1; i <= n; i++) max = Math.max(max, dist[i]);

        int answer = 0;
        for (int i = 1; i <= n; i++) if (dist[i] == max) answer++;
        return answer;
    }
}
