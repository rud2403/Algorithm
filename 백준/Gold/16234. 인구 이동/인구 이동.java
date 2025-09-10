import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n, l, r;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1}; // 상 하 좌 우
    static int[][] countries;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        countries = new int[n][n];
        // countries 세팅
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                countries[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        while(true) {
            visited = new boolean[n][n];
            boolean moved = false; // 그 날에 연합이 1개 이상 생겼는지

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(visited[i][j]) continue;

                    List<int[]> visitList = new ArrayList<>();
                    int sum = dfs(i, j, visitList);

                    // 연합 크기
                    int size = visitList.size();
                    if(size >= 2) moved = true;

                    int avg = sum / size;


                    for(int[] p : visitList) {
                        countries[p[0]][p[1]] = avg;
                    }
                }
            }
            if(!moved) break; // 더 이상 이동 없으면 종료
            answer++;
        }
        System.out.println(answer);
    }

    public static int dfs(int x, int y, List<int[]> visitList) {
        visited[x][y] = true; // 방문 처리
        visitList.add(new int[]{x, y}); // 방문한 나라의 x, y 값 저장
        int sum = countries[x][y]; // 합에 방문한 나라의 인구 수 추가

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) continue;

            int diff = Math.abs(countries[x][y] - countries[nx][ny]);
            if (diff >= l && diff <= r) {
                sum += dfs(nx, ny, visitList);
            }
        }
        return sum;
    }
}