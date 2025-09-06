import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1}; // 상 하 좌 우
    static int cnt = 0; // 그림의 개수
    static int wid = 0; // 가장 넓은 크기의 그림
    static int n; // 도화지의 세로 크기
    static int m; // 도화지의 가로 크기
    static int[][] board; // 도화지
    static boolean[][] checked; // 체크 여부
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 도화지의 세로 크기
        m = Integer.parseInt(st.nextToken()); // 도화지의 가로 크기
        board = new int[n][m]; // 도화지
        checked = new boolean[n][m]; // 체크 여부

        // 도화지 세팅
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 도화지 탐색하며 dfs 실행
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                wid = Math.max(dfs(i, j, true), wid);
            }
        }

        System.out.println(cnt);
        System.out.println(wid);
    }

    static public int dfs(int x, int y, boolean addCnt) {
        if(board[x][y] != 1 || checked[x][y]) return 0; // 그림(1)이 아니거나 이미 방문한 곳이면 return
        if(addCnt) cnt += 1; // 처음 방문한 곳이면 그림 수 + 1
        checked[x][y] = true;
        int addWid = 1;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                addWid += dfs(nx, ny, false);
            }

        }

        return addWid;
    }
}