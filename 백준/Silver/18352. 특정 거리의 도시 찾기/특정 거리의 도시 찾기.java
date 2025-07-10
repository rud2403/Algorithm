import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> nodes = new HashMap<>(); // 노드 별 단방향 노드 체크
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = bf.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]); // 도시의 개수
        int M = Integer.parseInt(strArr[1]); // 도로의 개수
        int K = Integer.parseInt(strArr[2]); // 거리 정보
        int X = Integer.parseInt(strArr[3]); // 출발 도시의 번호
        Queue<Integer> queue = new LinkedList<>();
        boolean flag = false;
        visited = new int[N + 1]; // visited에 방문 횟수 카운트 하기
        Arrays.fill(visited, -1);

        // nodes 세팅
        for(int i = 0; i < M; i++) {
            String[] citys = bf.readLine().split(" ");
            int start = Integer.parseInt(citys[0]);
            int end = Integer.parseInt(citys[1]);

            if(nodes.containsKey(start)) {
                List newList = nodes.get(start);
                newList.add(end);
                nodes.put(start, newList);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(end);
                nodes.put(start, list);
            }
        }

        queue.offer(X);
        visited[X] = 0;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            if(!nodes.containsKey(current)) continue;

            for(int next : nodes.get(current)) {
                if(visited[next] == -1) {
                    visited[next] = visited[current] + 1;
                    queue.offer(next);
                }
            }
        }

        for(int i = 0; i < visited.length; i++) {
            if(visited[i] == K) {
                System.out.println(i);
                flag = true;
            }
        }

        if(!flag) {
            System.out.println(-1);
        }
    }
}