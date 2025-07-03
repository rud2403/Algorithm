import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n; // n개의 줄
    static int[][] graph; // 방향 그래프
    static int[][] map; // i to j 양수인 경로
    static boolean[][] visited; // 방문 기록
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        graph = new int[n][n];
        map = new int[n][n];
        visited = new boolean[n][n];

        // graph 세팅
        for(int i = 0; i < n; i++) {
            String[] rows = bf.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(rows[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            checkMap(i, i);
        }

        for(int[] rows : map) {
            for(int val : rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static public void checkMap(int start, int current) {
        for(int i = 0; i < n; i++) {
            if(graph[current][i] == 1 && !visited[start][i]) {
                map[start][i] = 1;
                visited[start][i] = true;
                checkMap(start, i);
            }
        }
    }
}
