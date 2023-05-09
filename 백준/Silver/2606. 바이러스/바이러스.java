import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int map[][];
    static boolean visit[];
    static int count, net, v;
    static int result = 0;

    private static int dfs(int i) {
        visit[i] = true;

        for (int j = 1; j <= count; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                result++;
                dfs(j);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(br.readLine());
        net = Integer.parseInt(br.readLine());

        v = 1;

        map = new int[count + 1][count + 1];
        visit = new boolean[count + 1];

        for (int i = 0; i < net; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            map[a][b] = map[b][a] = 1;

        }

        System.out.println(dfs(1));
        br.close();
    }
}
