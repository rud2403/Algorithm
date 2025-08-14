import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] answer;
    static boolean[] visited;
    static Map<Integer, ArrayList> map = new HashMap<>();
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 수
        int m = Integer.parseInt(st.nextToken()); // 간선의 수
        int r = Integer.parseInt(st.nextToken()); // 시작 정점

        answer = new int[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < n; i++) { // 정점 세팅
            map.put(i + 1, new ArrayList());
        }

        // map 및 list 세팅
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            ArrayList list = map.get(start);
            list.add(end);
            map.put(start, list);

            ArrayList list2 = map.get(end);
            list2.add(start);
            map.put(end, list2);
        }

        // 내림차순 정렬
        for(int i = 1; i <= map.size(); i++) {
            Collections.sort(map.get(i), Comparator.reverseOrder());
        }

        dfs(r);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < answer.length; i++) sb.append(answer[i]).append(" ");
        System.out.print(sb);

    }

    public static void dfs(int currentNode) {
        visited[currentNode] = true;
        answer[currentNode] = count;

        for(int i = 0; i < map.get(currentNode).size(); i++) {
            int nextNode = (int)map.get(currentNode).get(i);
            if(!visited[nextNode]) {
                count++;
                dfs(nextNode);
            }
        }

    }
}
