import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n, m;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = bf.readLine().split(" "); // n까지의 자연수

        n = Integer.parseInt(strArray[0]);
        m = Integer.parseInt(strArray[1]);
        result = new int[m];
        visited = new boolean[n + 1];

        dfs(0);

        System.out.println(sb);

    }

    public static void dfs(int depth) {
        if (depth == m) {
            for(int i = 0; i < result.length; i++ ) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}