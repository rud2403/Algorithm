import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1}; // 상 하 좌 우
    static int[][] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int[][] box = new int[m][n];
        checked = new int[m][n];
        int cnt = 0; // 날짜 카운트

        Deque<Tomato> dq = new ArrayDeque<>();

        // 박스 세팅
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int tomatoStatus = Integer.parseInt(st.nextToken());
                box[i][j] = tomatoStatus;

                if(tomatoStatus == 1) {
                    Tomato tomato = new Tomato(i, j, 0);
                    dq.offerLast(tomato);
                }
            }
        }

        while(!dq.isEmpty()) {
            Tomato t = dq.pollFirst();
            int cx = t.x;
            int cy = t.y;
            int date = t.date;

            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n) { // 범위 안에 있으면
                    if(box[nx][ny] == 0) { // 아직 안익은 토마토가 들어있다면
                        box[nx][ny] = 1;
                        dq.offerLast(new Tomato(nx, ny, date + 1));
                        cnt = Math.max(cnt, date + 1);
                    }
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(box[i][j] == 0) { // 아직 안익은 토마토가 남아있는 경우
                    cnt = -1;
                }
            }
        }

        System.out.println(cnt);

    }
    public static class Tomato {
        int x;
        int y;
        int date;

        public Tomato(int x, int y, int date) {
            this.x = x;
            this.y = y;
            this.date = date;
        }
    }
}



