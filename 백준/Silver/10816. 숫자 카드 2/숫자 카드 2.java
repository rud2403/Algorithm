import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final int OFFSET = 10_000_000;
    static final int SIZE = 20_000_001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[SIZE];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            cnt[Integer.parseInt(st.nextToken()) + OFFSET]++;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        // 찾기 시작
        for(int i = 0; i < m; i++) {
            sb.append(cnt[Integer.parseInt(st.nextToken()) + OFFSET]).append(" ");
        }
            System.out.print(sb.toString());
    }
}

