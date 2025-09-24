import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static boolean[] used;
    static int[] perm;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        used = new boolean[n + 1];
        perm = new int[n];
        dfs(0);
        System.out.print(sb);
    }

    public static void dfs(int depth) {
        if(depth == n) {
            for(int i = 0; i < n; i++) {
                sb.append(perm[i]).append(" ");
            }
            
            sb.append('\n');
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(used[i]) continue;
            used[i] = true;
            perm[depth] = i;
            dfs(depth + 1);
            used[i] = false;
        }
    }
}
