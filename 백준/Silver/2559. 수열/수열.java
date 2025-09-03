import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 전체 날짜의 수
        int k = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜의 수

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i = 0; i <= k - 1; i++) sum += a[i];
        int answer = sum;

        for(int r = k; r < n; r++) {
            sum += a[r] - a[r - k];
            if(sum > answer) answer = sum;
        }

        System.out.println(answer);

    }
}