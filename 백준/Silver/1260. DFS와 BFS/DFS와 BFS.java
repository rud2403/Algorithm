import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    static int[][] map;
    static int[] visit;
    static int node;
    static int line;
    static int start;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        node = Integer.parseInt(strArr[0]);
        line = Integer.parseInt(strArr[1]);
        start = Integer.parseInt(strArr[2]);

        map = new int[node + 1][node + 1];
        visit = new int[node + 1];

        for(int i = 1; i <= line; i++) {

            String str = br.readLine();

            int x = Integer.parseInt(str.split(" ")[0]);
            int y = Integer.parseInt(str.split(" ")[1]);

            map[x][y] = 1;
            map[y][x] = 1;
        }

        dfs(start);

        visit = new int[node + 1];
        System.out.println();

        bfs();
    }

    public static void dfs(int i) {
        visit[i] = 1;
        System.out.print(i + " ");

        for(int j = 1; j <= node; j++) {
            if(map[i][j] == 1 && visit[j] == 0) {
                dfs(j);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = 1;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for(int j = 1; j <= node; j++) {
                if(map[temp][j] == 1 && visit[j] == 0) {
                    queue.offer(j);
                    visit[j] = 1;
                    System.out.print(j + " ");
                }
            }
        }
    }
}