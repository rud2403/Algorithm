import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int[][] map;
    static boolean[][] visited;
    static int now_x, now_y;
    static int m, n, k;
    static int result; // 필요한 지렁이 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < caseCount; i++) {
            String[] strArr = br.readLine().split(" ");

            m = Integer.parseInt(strArr[0]); // 배추밭의 가로길이
            n = Integer.parseInt(strArr[1]); // 배추밭의 세로길이
            k = Integer.parseInt(strArr[2]); // 배추가 심어져 있는 위치의 개수

            map = new int[51][51];
            visited = new boolean[51][51];

            for(int j = 1; j <= k; j++) {
                String[] strArr2 = br.readLine().split(" ");

                int x = Integer.parseInt(strArr2[0]);
                int y = Integer.parseInt(strArr2[1]);

//                map[x][y] = 1;
                map[y][x] = 1;
            }

            result = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(map[j][k] == 1 && visited[j][k] == false) {
                        result++;
                        dfs(k, j);
                    }
                }
            }

            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            now_x = x + dirX[i];
            now_y = y + dirY[i];

            if(range_check() && visited[now_y][now_x] == false && map[now_y][now_x] == 1) {
                dfs(now_x, now_y);
            }
        }
    }

    static boolean range_check() {
        return (now_y < n && now_y >= 0 && now_x < m && now_x >= 0);
    }
}