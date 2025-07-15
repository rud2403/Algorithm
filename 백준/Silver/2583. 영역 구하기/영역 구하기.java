import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int M; // 행의 수
        int N; // 열의 수
        int K; // 직사각형의 수

        String[] strArr = bf.readLine().split(" ");
        M = Integer.parseInt(strArr[0]);
        N = Integer.parseInt(strArr[1]);
        K = Integer.parseInt(strArr[2]);

        List<Integer> list = new ArrayList<>();

        map = new int[M][N];
        visited = new boolean[M][N];

        // 직사각형 K개 그리기
        for(int i = 0; i < K; i++) {
            String[] str = bf.readLine().split(" ");
            int startRow = Integer.parseInt(str[1]);
            int endRow = Integer.parseInt(str[3]) - 1;
            int startCol = Integer.parseInt(str[0]);
            int endCol = Integer.parseInt(str[2]) - 1;

            for(int j = startRow; j <= endRow; j++) { // 행
                for(int k = startCol; k <= endCol; k++) { // 열
                    map[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                int count = dfs(i, j);
                if(count != 0) {
                    list.add(count);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int area : list) {
            System.out.print(area + " ");
        }
    }

    public static int dfs(int x, int y) {
        if(x < 0 || y < 0 || x >= map.length || y >= map[0].length) return 0;
        if(visited[x][y] == true || map[x][y] == 1) return 0; // 방문했었거나 벽인 경우

        visited[x][y] = true;
        int count = 1;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
                count += dfs(nx, ny);
        }

        return count;
    }
}